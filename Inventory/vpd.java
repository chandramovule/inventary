import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class vpd extends JFrame implements ActionListener
{
JTable table1;
JLabel l1;
//JTextField t1;
JComboBox dd,mm,yy;
JButton b1,b2;
JScrollPane jsp1;
Container c;
String head1[]={"Cus_id", "Date", "Cus_Name", "Amount"};
String data1[][]=new String[30][30];
String[] dd1={ "date","1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11", "12", "13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", "24", "25", "26", "27", "28", "29","30","31"  };
String[] mm1={"month", "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct","nov", "dec"  };
String[] yy1={"year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
TableColumn column, column1, column2, column3;
int y=0;
public vpd()
{
setSize(500,500);
setTitle("View particular bill by date");
setVisible(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2,((screen.height-350)/2));
JFrame.setDefaultLookAndFeelDecorated(true);
c=getContentPane();
c.setLayout(null);
c.setBackground(Color.pink);
l1=new JLabel("Enter date:");
l1.setBounds(50,50,90,30);
//t1=new JTextField();
//t1.setBounds(150,50,90,30);
dd=new JComboBox(dd1);
mm=new JComboBox(mm1);
yy=new JComboBox(yy1);
dd.setBounds(150,50,90,30);
mm.setBounds(250,50,90,30);
yy.setBounds(350,50,90,30);
b1=new JButton("Ok");
b1.setBounds(120, 400, 90,40);
b1.addActionListener(this);
b2=new JButton("Back");
b2.setBounds(240,400,90,40);
b2.addActionListener(this);
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
table1.setRowHeight(25);
table1.setGridColor(Color.black);
jsp1.setBounds(30, 150, 350,200);
c.add(jsp1);
c.add(b1);
c.add(b2);
c.add(l1);
//c.add(t1);
c.add(dd);
c.add(mm);
c.add(yy);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
//String s=t1.getText();
int i1=dd.getSelectedIndex();
int i2=mm.getSelectedIndex();
int i3=yy.getSelectedIndex();
System.out.println(dd1[i1]+"/"+mm1[i2]+"/"+yy1[i3]);
String s=dd1[i1]+"/"+mm1[i2]+"/"+yy1[i3];
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select * from bill where Date='"+s+"'");
while(rs.next())
{
data1[y][0]=rs.getString(1);
data1[y][1]=rs.getString(2);
data1[y][2]=rs.getString(3);
data1[y][3]=rs.getString(4);
y++;
}
st.close();
c.close();
}
catch(Exception ee)
{
System.out.println(ee);
}
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new sr().setVisible(true);
//this.setVisible(false);
}
}
}
