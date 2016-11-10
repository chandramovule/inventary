import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class bill5 extends JFrame implements ActionListener, ItemListener
{
JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19,l20;
JTextField t1, t2, t4, t6, t18, t19,t20;
JTextArea t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17;
JComboBox d1, dd, mm, yy, id;
JButton b1, b2, b3;
JTable tb;
TableColumn c1, c2, c3, c4, c5, c6;
int i=1, y=0, s=0;
String h[]={"Sno", "Type", "Company Name", "Quantity", "Price", "Amount"};
String d[][]=new String[40][40];
JScrollPane jsp;
Container c;
String[] dd1={ "date","1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11", "12", "13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", "24", "25", "26", "27", "28", "29","30","31"  };
String[] mm1={"month", "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct","nov", "dec"  };
String[] yy1={"year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
public bill5()
{
setSize(getToolkit().getScreenSize());
setTitle("Bill for laptops");
setLayout(null);
setVisible(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
l1=new JLabel("Cus_id");
l2=new JLabel("Cus_Name");
l3=new JLabel("Date");
l4=new JLabel("Type");
l5=new JLabel("Configure_ID");
l6=new JLabel("Company Name");
l7=new JLabel("Processor");
l8=new JLabel("Memory");
l9=new JLabel("Display size");
l10=new JLabel("Hard Disk Drive");
l11=new JLabel("Graphics Memory");
l12=new JLabel("Ports and others");
l13=new JLabel("Connectivity");
l14=new JLabel("Keyboard");
l15=new JLabel("AC Power adapter");
l16=new JLabel("Battery type");
l17=new JLabel("Operating System");
l18=new JLabel("Quantity");
l19=new JLabel("Amount");
l20=new JLabel("Total");
t1=new JTextField(10);
t2=new JTextField(20);
t4=new JTextField("Laptop");
t4.setEditable(false);
t6=new JTextField(10);
t7=new JTextArea();
t8=new JTextArea();
t9=new JTextArea();
t10=new JTextArea();
t11=new JTextArea();
t12=new JTextArea();
t13=new JTextArea();
t14=new JTextArea();
t15=new JTextArea();
t16=new JTextArea();
t17=new JTextArea();
t18=new JTextField(10);
t19=new JTextField(10);
t20=new JTextField(10);
d1=new JComboBox();
d1.addItem("Select");
d1.addItemListener(this);
id=new JComboBox();
id.addItem("Existing id");
id.addItemListener(this);
dd=new JComboBox(dd1);
dd.setBounds(200, 90, 80, 20);
mm=new JComboBox(mm1);
mm.setBounds(290, 90, 80, 20);
yy=new JComboBox(yy1);
yy.setBounds(380, 90, 80, 20);
l1.setBounds(50, 30, 120, 25);
id.setBounds(200, 30, 100, 25);
t1.setBounds(310, 30, 50, 25);
l2.setBounds(50, 60, 120, 25);
t2.setBounds(200, 60, 100, 25);
l3.setBounds(50, 90, 120, 25);
l4.setBounds(50, 120, 120, 25);
t4.setBounds(200, 120, 100, 25);
l5.setBounds(50, 150, 120, 25);
d1.setBounds(200, 150, 100, 25);
l6.setBounds(50, 180, 120, 25);
t6.setBounds(200, 180, 100, 25);
l7.setBounds(50, 210,120, 25);
t7.setBounds(200, 210, 250, 25);
l8.setBounds(50, 240, 120, 25);
t8.setBounds(200, 240, 250, 25);
l9.setBounds(50, 270, 120, 25);
t9.setBounds(200, 270, 250, 25);
l10.setBounds(50, 300, 120, 25);
t10.setBounds(200, 300, 250, 25);
l11.setBounds(50, 330, 120, 25);
t11.setBounds(200, 330, 250, 25);
l12.setBounds(50, 360, 120, 25);
t12.setBounds(200, 360, 250,25);
l13.setBounds(50, 390, 120, 25);
t13.setBounds(200, 390, 250, 25);
l14.setBounds(50, 420, 120, 25);
t14.setBounds(200, 420, 250, 25);
l15.setBounds(50, 450, 120, 25);
t15.setBounds(200, 450, 250, 25);
l16.setBounds(50, 480, 120, 25);
t16.setBounds(200, 480, 250, 25);
l17.setBounds(50, 510, 120, 25);
t17.setBounds(200, 510, 250, 25);
l18.setBounds(50, 540, 120, 25);
t18.setBounds(200, 540, 100, 25);
l19.setBounds(50, 570, 120, 25);
t19.setBounds(200, 570, 100, 25);
t19.setEditable(false);
l20.setBounds(880, 400, 100, 25);
t20.setBounds(930, 400, 100, 25);
t20.setEditable(false);
b1=new JButton("Attach");
b1.setBounds(750, 400, 80, 30);
b2=new JButton("OK");
b2.setBounds(800, 500, 80, 30);
b3=new JButton("Back");
b3.setBounds(950, 500, 80, 30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
c=getContentPane();
c.setBackground(Color.pink);
tb=new JTable(d, h);
jsp=new JScrollPane(tb);
tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
c1=tb.getColumnModel().getColumn(0);
c1.setPreferredWidth(50);
c2=tb.getColumnModel().getColumn(1);
c2.setPreferredWidth(100);
c3=tb.getColumnModel().getColumn(2);
c3.setPreferredWidth(100);
c4=tb.getColumnModel().getColumn(3);
c4.setPreferredWidth(80);
c5=tb.getColumnModel().getColumn(4);
c5.setPreferredWidth(80);
c6=tb.getColumnModel().getColumn(5);
c6.setPreferredWidth(80);
tb.setRowHeight(25);
tb.setGridColor(Color.black);
jsp.setBounds(640, 150, 510, 200);
c.add(jsp);
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
c.add(d1);
c.add(l6);
c.add(t6);
c.add(l7);
c.add(t7);
c.add(l8);
c.add(t8);
c.add(l9);
c.add(t9);
c.add(l10);
c.add(t10);
c.add(l11);
c.add(t11);
c.add(l12);
c.add(t12);
c.add(l13);
c.add(t13);
c.add(l14);
c.add(t14);
c.add(l15);
c.add(t15);
c.add(l16);
c.add(t16);
c.add(l17);
c.add(t17);
c.add(l18);
c.add(t18);
c.add(l19);
c.add(t19);
c.add(l20);
c.add(t20); 
c.add(b1);
c.add(b2);
c.add(b3);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select Configure_ID from lap");
while(rs.next())
{
d1.addItem(rs.getString("Configure_ID"));
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
Connection cc1=DriverManager.getConnection("jdbc:odbc:sss","root", "");
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
d[y][2]=t6.getText().toString();
d[y][3]=t18.getText().toString();
d[y][4]=t19.getText().toString();
d[y][5]=Integer.toString(Integer.parseInt(t18.getText())*Integer.parseInt(t19.getText()));
y++;
s=s+Integer.parseInt(t18.getText())*Integer.parseInt(t19.getText());
t20.setText(Integer.toString(s));
String s1=d1.getSelectedItem().toString();
int r=Integer.parseInt(t18.getText());
int r1, r2;
r1=0;
r2=0;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection  c2=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st1=c2.createStatement();
ResultSet rs2=st1.executeQuery("select * from lap where Configure_ID='"+s1+"'");
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
PreparedStatement ps1=c3.prepareStatement("select * from lap where Configure_ID='"+s1+"'");
ResultSet rs3=ps1.executeQuery();
PreparedStatement ps2=c3.prepareStatement("update lap set Quantity="+r2+" where Configure_ID='"+s1+"'");
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
int p1=Integer.parseInt(t20.getText());
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cc=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st=cc.createStatement();
st.executeUpdate("insert into bill values("+p+", '"+g1+"', '"+g+"', "+p1+")");
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
ResultSet rs2=st5.executeQuery("select Company_Name, Processor, Memory, Display_Size, Hard_Disk_Drive, Graphics_Memory,Ports_and_others, Connectivity, Keyboard, AC_power_adapter, Battery_type, OS, Price from lap where Configure_ID='"+s1+"'");
while(rs2.next())
{
t6.setText(rs2.getString("Company_Name"));
t7.setText(rs2.getString("Processor"));
t8.setText(rs2.getString("Memory"));
t9.setText(rs2.getString("Display_Size"));
t10.setText(rs2.getString("Hard_Disk_Drive"));
t11.setText(rs2.getString("Graphics_Memory"));
t12.setText(rs2.getString("Ports_and_others"));
t13.setText(rs2.getString("Connectivity"));
t14.setText(rs2.getString("Keyboard"));
t15.setText(rs2.getString("AC_power_adapter"));
t16.setText(rs2.getString("Battery_type"));
t17.setText(rs2.getString("OS"));
t19.setText(rs2.getString("Price"));
}
st5.close();
c2.close();
}
catch(Exception ec)
{
System.out.println(ec);
}
}
public static void main(String ttt[])
{
new bill5();
}
}