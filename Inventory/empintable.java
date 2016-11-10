import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.io.*;
public class empintable extends JFrame implements ActionListener
{
JButton b11;
JTable table1;
JScrollPane jsp1;
String head1[]={"ID","NAME","AGE","SEX","ADDRESS","CELL_NO","EMAIL_ID","QUALIFICATION","EXPERIENCE","SALARY","JOINDATE"};
String data1[][]=new String[30][30];
TableColumn column,column1,column2,column3,column4,column5,column6,column7,column8,column9,column10;
int y=0;
public empintable()
{
setSize(700,700);
setTitle(" Employee details in table format");
JFrame.setDefaultLookAndFeelDecorated(true);
Container c2=this.getContentPane();
c2.setLayout(null);
c2.setBackground(Color.pink);
setResizable(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
b11=new JButton("OK");
b11.setBounds(275,600,150,50);
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

column6=table1.getColumnModel().getColumn(6);
column6.setPreferredWidth(100);

column7=table1.getColumnModel().getColumn(7);
column7.setPreferredWidth(100);

column8=table1.getColumnModel().getColumn(8);
column8.setPreferredWidth(100);

column9=table1.getColumnModel().getColumn(9);
column9.setPreferredWidth(100);
column10=table1.getColumnModel().getColumn(10);
column10.setPreferredWidth(100);
table1.setRowHeight(40);
table1.setGridColor(Color.black);
jsp1.setBounds(0,0,600,300);
c2.add(jsp1);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c3=DriverManager.getConnection("jdbc:odbc:sss");
Statement st=c3.createStatement();
String s12="select * from employee";
ResultSet rs=st.executeQuery(s12);
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
new employee().setVisible(true);
}
}
}

