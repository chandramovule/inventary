import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class vas extends JFrame implements ActionListener
{
Container c;
JTable table1;
JButton b1;
JScrollPane jsp1;
String head1[]={"Purchase_ID", "Supplier_ID", "Description", "Quantity", "Price"};
String data1[][]=new String[30][30];
TableColumn column,column1,column2,column3,column4;
int y=0;
public vas()
{
setSize(550,500);
setTitle("View all software");
setVisible(true);
c=getContentPane();
c.setLayout(null);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2, ((screen.height-350)/2));
c.setBackground(Color.pink);
JFrame.setDefaultLookAndFeelDecorated(true);
table1=new JTable(data1,head1);
b1=new JButton("Back");
b1.setBounds(220,320,90,40);
b1.addActionListener(this);
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
jsp1.setBounds(10,10,404,200);
c.add(jsp1);
c.add(b1);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=c1.createStatement();
String s11="select * from soft";
ResultSet rs=st.executeQuery(s11);
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
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.setVisible(false);
new str().setVisible(true);
}
}
}