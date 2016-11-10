import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class eps extends JFrame implements ActionListener, ItemListener
{
JTable table1;
JLabel l1;
JComboBox j;
JButton b1,b2;
JScrollPane jsp1;
Container c;
String head1[]={"Purchase_ID", "Supplier_ID", "Description", "Quantity", "Price"};
String data1[][]=new String[30][30];
TableColumn column,column1,column2,column3,column4;
int y=0;
public eps()
{
setSize(550,500);
setTitle("View particular software product");
setVisible(true);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2,((screen.height-350)/2));
c=getContentPane();
c.setLayout(null);
c.setBackground(Color.pink);
JFrame.setDefaultLookAndFeelDecorated(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
l1=new JLabel("Product Description");
l1.setBounds(20,50,140,30);
j=new JComboBox();
j.addItemListener(this);
j.addItem("Select");
j.setBounds(150,50,100,30);
b1=new JButton("Ok");
b1.setBounds(270,50,50,30);
b1.addActionListener(this);
b2=new JButton("Back");
b2.setBounds(340,50,90,30);
b2.addActionListener(this);
//setVisible(false);
//setResizable(true);
table1=new JTable(data1,head1);
jsp1=new JScrollPane(table1);
table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
column=table1.getColumnModel().getColumn(0);
column.setPreferredWidth(80);
column1=table1.getColumnModel().getColumn(1);
column1.setPreferredWidth(80);
column2=table1.getColumnModel().getColumn(2);
column2.setPreferredWidth(100);
column3=table1.getColumnModel().getColumn(3);
column3.setPreferredWidth(80);
column4=table1.getColumnModel().getColumn(4);
column4.setPreferredWidth(80);
table1.setRowHeight(25);
table1.setGridColor(Color.black);
jsp1.setBounds(10,100,404,200);
c.add(jsp1);
c.add(b1);
c.add(b2);
c.add(l1);
c.add(j);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=c1.createStatement();
ResultSet rs=st.executeQuery("select Description from soft");
while(rs.next())
{
j.addItem(rs.getString("Description"));
}
st.close();
c1.close();
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String s=j.getSelectedItem().toString();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=c1.createStatement();
ResultSet rs=st.executeQuery("select * from soft where Description='"+s+"'");
while(rs.next())
{
data1[y][0]=rs.getString(1);
data1[y][1]=rs.getString(2);
data1[y][2]=rs.getString(3);
data1[y][3]=rs.getString(4);
data1[y][4]=rs.getString(5);
y++;
}
st.close();
c1.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new ss().setVisible(true);

}
}
public void itemStateChanged(ItemEvent e)
{
}
public static void main(String z[])
{
new eps();
}
}