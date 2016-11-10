import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class supview extends JFrame implements ActionListener
{
JButton b11;
JTable table1;
JScrollPane jsp1;
String head1[]={"Supplier_ID","Supplier_Name","Supplier_Address","Supplier_Phno","Supplier_EmailID", "Supplies"};
String data1[][]=new String[20][20];
TableColumn column,column1,column2,column3,column4, column5;
int y=0;
public supview()
{
setSize(625,650);
setTitle("Supplier entries in table format");

JFrame.setDefaultLookAndFeelDecorated(true);
Container c2=this.getContentPane();
c2.setLayout(null);
//Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
//setLocation((screen.width-700)/2,screen.height-600)/2));
c2.setBackground(Color.pink);
//setVisible(false);
//setSize(800,1000);
setResizable(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
b11=new JButton("OK");
b11.setBounds(250,550,150,50);
c2.add(b11);
b11.addActionListener(this);
table1=new JTable(data1,head1);
jsp1=new JScrollPane(table1);
table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
column=table1.getColumnModel().getColumn(0);
column.setPreferredWidth(100);
column1=table1.getColumnModel().getColumn(1);
column1.setPreferredWidth(100);
column2=table1.getColumnModel().getColumn(2);
column2.setPreferredWidth(100);
column3=table1.getColumnModel().getColumn(3);
column3.setPreferredWidth(100);
column4=table1.getColumnModel().getColumn(4);
column4.setPreferredWidth(100);
column5=table1.getColumnModel().getColumn(5);
column5.setPreferredWidth(100);
table1.setRowHeight(40);
table1.setGridColor(Color.black);
//jsp1.setBounds(0,0,600,260);
jsp1.setBounds(0,0,520, 260);
c2.add(jsp1);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c3=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=c3.createStatement();
String s11="select * from supplier";
ResultSet rs=st.executeQuery(s11);
while(rs.next())
{
data1[y][0]=rs.getString(1);
data1[y][1]=rs.getString(2);
data1[y][2]=rs.getString(3);
data1[y][3]=rs.getString(4);
data1[y][4]=rs.getString(5);
data1[y][5]=rs.getString(6);
y++;
}
st.close();
c3.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b11)
{
this.setVisible(false);
new supp().setVisible(true);
}
}
}