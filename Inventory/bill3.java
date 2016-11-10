import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class bill3 extends JFrame implements ActionListener, ItemListener
{
JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9;
JTextField t1, t2, t3, t4, t5, t6, t7,t8;
JComboBox d1, dd, mm, yy, id;
JButton b1, b2, b3;
JTable tb;
TableColumn c1, c2, c3,c4,c5,c6;
int i=1, y=0, s=0;
String h[]={"Sno", "Type", "Description with size and model", "Quantity", "Price", "Amount"};
String d[][]=new String[30][30];
JScrollPane jsp;
Container c;
String[] dd1={ "date","1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11", "12", "13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", "24", "25", "26", "27", "28", "29","30","31"  };
String[] mm1={"month", "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct","nov", "dec"  };
String[] yy1={"year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
public bill3()
{
setSize(getToolkit().getScreenSize());
setTitle("Billing form for peripherals");
setLayout(null);
setVisible(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
l1=new JLabel("Cus_id");
l2=new JLabel("Cus_Name");
l3=new JLabel("Date");
l4=new JLabel("Type");
l5=new JLabel("Description");
l9=new JLabel("with size and model");
l6=new JLabel("Quantity");
l7=new JLabel("Amount");
l8=new JLabel("Total");
t1=new JTextField(10);
t2=new JTextField(20);
t4=new JTextField(20);
t4.setEditable(false);
t6=new JTextField(10);
t7=new JTextField(10);
t7.setEditable(false);
t8=new JTextField(15);
t8.setEditable(false);
d1=new JComboBox();
 d1.addItem("Select");
d1.addItemListener(this);
id=new JComboBox();
id.addItem("Existing id");
id.addItemListener(this);

dd=new JComboBox(dd1);
dd.setBounds(170,150,80,20);
mm=new JComboBox(mm1);
mm.setBounds(260, 150,80,20);
yy=new JComboBox(yy1);
yy.setBounds(350,150,80,20);
l1.setBounds(50, 50, 70, 25);
id.setBounds(170, 50, 100, 25);
t1.setBounds(280, 50, 50, 25);
l2.setBounds(50, 100, 70, 25);
t2.setBounds(170, 100, 100, 25);
l3.setBounds(50, 150, 70, 25);
l4.setBounds(50, 200, 70, 25);
t4.setBounds(170, 200, 100, 25);
l5.setBounds(50, 250, 70, 25);
l9.setBounds(20, 260, 120, 25);
d1.setBounds(170, 250, 200, 25);
l6.setBounds(50, 300, 70, 25);
t6.setBounds(170, 300, 100,25);
l7.setBounds(50, 350, 70, 25);
t7.setBounds(170, 350, 100, 25);
l8.setBounds(650, 400, 70, 25);
t8.setBounds(730, 400, 100, 25);
b1=new JButton("Attach");
b1.setBounds(550, 400, 80, 30);
b1.addActionListener(this);
b2=new JButton("OK");
b2.setBounds(600, 500, 80, 30);
b2.addActionListener(this);
b3=new JButton("Back");
b3.setBounds(750, 500, 80, 30);
b3.addActionListener(this);
c=getContentPane();
c.setBackground(Color.pink);
tb=new JTable(d,h);
jsp=new JScrollPane(tb);
tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
c1=tb.getColumnModel().getColumn(0);
c1.setPreferredWidth(50);
c2=tb.getColumnModel().getColumn(1);
c2.setPreferredWidth(100);
c3=tb.getColumnModel().getColumn(2);
c3.setPreferredWidth(200);
c4=tb.getColumnModel().getColumn(3);
c4.setPreferredWidth(80);
c5=tb.getColumnModel().getColumn(4);
c5.setPreferredWidth(80);
c6=tb.getColumnModel().getColumn(5);
c6.setPreferredWidth(80);
tb.setRowHeight(25);
tb.setGridColor(Color.black);
jsp.setBounds(540, 150, 545, 200);
c.add(l1);
c.add(id);
c.add(t1);
c.add(l2);
c.add(t2);
c.add(l3);
c.add(dd);
c.add(mm);
c.add(yy);
c.add(l4);
c.add(t4);
c.add(l5);
c.add(l9);
c.add(d1);
c.add(l6);
c.add(t6);
c.add(l7);
c.add(t7);
c.add(l8);
c.add(t8);
c.add(jsp);
c.add(b1);
c.add(b2);
c.add(b3);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select Description from hard1");
while(rs.next())
{
d1.addItem(rs.getString("Description"));
}
st.close();
c.close();
}
catch(Exception e)
{
System.out.println(e);
}
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cc1=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st11=cc1.createStatement();
ResultSet rss=st11.executeQuery("select Cus_id from bill");
while(rss.next())
{
id.addItem(rss.getString("Cus_id"));
}
st11.close();
cc1.close();
}
catch(Exception ez)
{
System.out.println(ez);
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.setVisible(false);
this.setVisible(true);
d[y][0]=Integer.toString(y+1);
d[y][1]=t4.getText().toString();
d[y][2]=d1.getSelectedItem().toString();
d[y][3]=t6.getText().toString();
d[y][4]=t7.getText().toString();
d[y][5]=Integer.toString(Integer.parseInt(t6.getText())*Integer.parseInt(t7.getText()));
y++;
s=s+Integer.parseInt(t6.getText())*Integer.parseInt(t7.getText());
t8.setText(Integer.toString(s));
String s1=d1.getSelectedItem().toString();
int r=Integer.parseInt(t6.getText());
int r1, r2;
r1=0;
r2=0;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c2=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st1=c2.createStatement();
ResultSet rs2=st1.executeQuery("select * from hard1 where Description='"+s1+"'");
while(rs2.next())
{
r1=rs2.getInt("Quantity");
}
r2=r1-r;
st1.close();
c2.close();
}
catch(Exception ee)
{
System.out.println(ee);
}
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c3=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st3=c3.createStatement();
PreparedStatement ps1=c3.prepareStatement("select * from hard1 where Description='"+s1+"'");
ResultSet rs3=ps1.executeQuery();
PreparedStatement ps2=c3.prepareStatement("update hard1 set Quantity="+r2+" where Description='"+s1+"'");
ResultSet rs4=ps2.executeQuery();
}
catch(Exception x)
{
System.out.println(x);
}
}
if(ae.getSource()==b3)
{
this.setVisible(false);
}
if(ae.getSource()==b2)
{
String g=t2.getText();
int i1=dd.getSelectedIndex();
int i2=mm.getSelectedIndex();
int i3=yy.getSelectedIndex();
System.out.println(dd1[i1]+"/"+mm1[i2]+"/"+yy1[i3]);
String g1=dd1[i1]+"/"+mm1[i2]+"/"+yy1[i3];
int p=Integer.parseInt(t1.getText());
int p1=Integer.parseInt(t8.getText());
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cc=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st=cc.createStatement();
st.executeUpdate("insert into bill values("+p+", '"+g1+"', '"+g+"',"+p1+")");
JOptionPane.showMessageDialog(this, "Success");
st.close();
cc.close();
}
catch(Exception q)
{
System.out.println(q);
JOptionPane.showMessageDialog(this, "Duplicate Cus_id");
}
}
}
public void itemStateChanged(ItemEvent ie)
{
String s1=d1.getSelectedItem().toString();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c2=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st5=c2.createStatement();
ResultSet rs2=st5.executeQuery("select Type, Price from hard1 where Description='"+s1+"'");
while(rs2.next())
{
t4.setText(rs2.getString("Type"));
t7.setText(rs2.getString("Price"));
}
st5.close();
c2.close();
}
catch(Exception ec)
{
System.out.println(ec);
}
}
public static void main(String args[])
{
new bill3();
}
}




