import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class psy extends JFrame implements ActionListener, ItemListener
{
JTable table1;
JLabel l1;
JComboBox j;
JButton b1, b2;
JScrollPane jsp1;
Container c;
String head1[]={"Purchase_ID", "Supplier_ID", "Configure_ID", "Company Name", "Monitor","Processor", "Memory", "Hard Disk Drive", "Ports and others",  "Keyboard", "Mouse", "Operating System", "Quantity", "Price"};
String data1[][]=new String[40][40];
TableColumn column, column1, column2, column3, column4, column5,column6, column7, column8, column9, column10, column11, column12, column13;
int y=0;
public psy()
{
setSize(700, 700);
setTitle("View particular system");
setVisible(true);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-700)/2, ((screen.height-600)/2));
c=getContentPane();
c.setLayout(null);
c.setBackground(Color.pink);
JFrame.setDefaultLookAndFeelDecorated(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
l1=new JLabel("Configure_ID");
l1.setBounds(10, 10, 100, 30);
j=new JComboBox();
j.addItem("select");
j.setBounds(170, 10, 100, 30);
j.addItemListener(this);
b1=new JButton("Ok");
b1.setBounds(280, 10, 100, 30);
b1.addActionListener(this);
b2=new JButton("Back");
b2.setBounds(300, 500, 90, 30);
b2.addActionListener(this);
table1=new JTable(data1, head1);
jsp1=new JScrollPane(table1);
table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
column=table1.getColumnModel().getColumn(0);
column.setPreferredWidth(100);
column1=table1.getColumnModel().getColumn(1);
column1.setPreferredWidth(100);
column2=table1.getColumnModel().getColumn(2);
column2.setPreferredWidth(100);
column3=table1.getColumnModel().getColumn(3);
column3.setPreferredWidth(200);
column4=table1.getColumnModel().getColumn(4);
column4.setPreferredWidth(250);
column5=table1.getColumnModel().getColumn(5);
column5.setPreferredWidth(250);
column6=table1.getColumnModel().getColumn(6);
column6.setPreferredWidth(250);
column7=table1.getColumnModel().getColumn(7);
column7.setPreferredWidth(250);
column8=table1.getColumnModel().getColumn(8);
column8.setPreferredWidth(250);
column9=table1.getColumnModel().getColumn(9);
column9.setPreferredWidth(250);
column10=table1.getColumnModel().getColumn(10);
column10.setPreferredWidth(250);
column11=table1.getColumnModel().getColumn(11);
column11.setPreferredWidth(250);
column12=table1.getColumnModel().getColumn(12);
column12.setPreferredWidth(250);
column13=table1.getColumnModel().getColumn(13);
column13.setPreferredWidth(100);
table1.setRowHeight(30);
table1.setGridColor(Color.black);
jsp1.setBounds(0, 50 ,690, 300);
c.add(l1);
c.add(jsp1);
c.add(j);
c.add(b1);
c.add(b2);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st=c1.createStatement();
ResultSet rs=st.executeQuery("select Configure_ID from sys");
while(rs.next())
{
j.addItem(rs.getString("Configure_ID"));
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
Connection c1=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st=c1.createStatement();
ResultSet rs=st.executeQuery("select * from sys where Configure_ID='"+s+"'");
while(rs.next())
{
data1[y][0]=rs.getString(1);
data1[y][1]=rs.getString(2);
data1[y][2]=rs.getString(3);
data1[y][3]=rs.getString(4);
data1[y][4]=rs.getString(5);
data1[y][5]=rs.getString(6);
data1[y][6]=rs.getString(7);
data1[y][7]=rs.getString(8);
data1[y][8]=rs.getString(9);
data1[y][9]=rs.getString(10);
data1[y][10]=rs.getString(11);
data1[y][11]=rs.getString(12);
data1[y][12]=rs.getString(13);
data1[y][13]=rs.getString(14);
y++;
}
st.close();
c1.close();
}
catch(Exception e)
{
System.out.println(e);
System.out.println("eeeeee");
}
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new str().setVisible(true);
}
}
public void itemStateChanged(ItemEvent ie)
{
}
public static void main(String eee[])
{
new psy();
}
}