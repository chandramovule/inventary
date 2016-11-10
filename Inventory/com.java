import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
public class com extends JFrame implements ActionListener, ItemListener
{
JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
JTextField t1, t3, t13, t14;
JTextArea  t4, t5, t6, t7, t8, t9, t10, t11, t12;
JButton b1, b2, b3, b4;
JComboBox id, id1, id2;
Container c;
public com()
{
setSize(600, 600);
setTitle("Purchase entry for system");
setVisible(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-700)/2,((screen.height-700)/2));
setLayout(null);
l1=new JLabel("Purchase_ID");
l2=new JLabel("Supplier_ID");
l3=new JLabel("Configure_ID");
l4=new JLabel("Company Name");
l5=new JLabel("Monitor model, size");
l6=new JLabel("Processor");
l7=new JLabel("Memory");
l8=new JLabel("Hard Disk Drive");
l9=new JLabel("Ports and others");
l10=new JLabel("Keyboard");
l11=new JLabel("Mouse");
l12=new JLabel("Operating System");
l13=new JLabel("Quantity");
l14=new JLabel("Price");
l1.setBounds(20, 30, 120, 25);
l2.setBounds(20, 60, 120, 25);
l3.setBounds(20, 90, 120, 25);
l4.setBounds(20, 120, 120, 25);
l5.setBounds(20, 150, 120, 25);
l6.setBounds(20, 180, 120, 25);
l7.setBounds(20, 210, 120, 25);
l8.setBounds(20, 240, 120, 25);
l9.setBounds(20, 270, 120, 25);
l10.setBounds(20, 300, 120, 25);
l11.setBounds(20, 330, 120, 25);
l12.setBounds(20, 360, 120, 25);
l13.setBounds(20, 390, 120, 25);
l14.setBounds(20, 420, 120, 25);
t1=new JTextField(10);
t1.setBounds(270, 30, 50, 25);
t3=new JTextField(10);
t3.setBounds(270, 90, 50, 25);
id=new JComboBox();
id.addItem("Existing id");
id.setBounds(150, 30, 100, 25);
id.addItemListener(this);
id1=new JComboBox();
id1.addItem("Select");
id1.setBounds(150, 60, 100, 25);
id1.addItemListener(this);
id2=new JComboBox();
id2.addItem("Existing id");
id2.setBounds(150, 90, 100, 25);
id2.addItemListener(this);
t4=new JTextArea();
t4.setBounds(150, 120,100, 25);
t5=new JTextArea();
t5.setBounds(150, 150,300, 25);
t6=new JTextArea();
t6.setBounds(150, 180,300, 25);
t7=new JTextArea();
t7.setBounds(150, 210,300, 25);
t8=new JTextArea();
t8.setBounds(150, 240,300, 25);
t9=new JTextArea();
t9.setBounds(150, 270,300, 25);
t10=new JTextArea();
t10.setBounds(150, 300,300, 25);
t11=new JTextArea();
t11.setBounds(150, 330,300, 25);
t12=new JTextArea();
t12.setBounds(150, 360,300, 25);
t13=new JTextField(10);
t13.setBounds(150, 390,100, 25);
t14=new JTextField(10);
t14.setBounds(150, 420,100, 25);
b1=new JButton("Insert");
b1.setBounds(110, 510, 80, 30);
b1.addActionListener(this);
b2=new JButton("Delete");
b2.setBounds(210, 510, 80, 30);
b2.addActionListener(this);
b3=new JButton("Clear");
b3.setBounds(310, 510, 80, 30);
b3.addActionListener(this);
b4=new JButton("Back");
b4.setBounds(410, 510, 80, 30);
b4.addActionListener(this);
c=getContentPane();
c.setBackground(Color.pink);
c.add(l1);
c.add(id);
c.add(t1);
c.add(l2);
c.add(id1);
c.add(l2);
c.add(id2);
c.add(l3);
c.add(t3);
c.add(l4);
c.add(t4);
c.add(l5);
c.add(t5);
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
c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st1=c1.createStatement();
ResultSet rs1=st1.executeQuery("select Purchase_ID from sys");
while(rs1.next())
{
id.addItem(rs1.getString("Purchase_ID"));
}
st1.close();
c1.close();
}
catch(Exception e1)
{
System.out.println(e1);
}
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c11=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st11=c11.createStatement();
ResultSet rs11=st11.executeQuery("select Supplier_ID from supplier where Supplies='Hardware' ");
//ResultSet rs11=st11.executeQuery("select Supplier_ID from supplier");
while(rs11.next())
{
id1.addItem(rs11.getString("Supplier_ID"));
}
st11.close();
c11.close();
}
catch(Exception e11)
{
System.out.println(e11);
}
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c12=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st12=c12.createStatement();
ResultSet rs12=st12.executeQuery("select Configure_ID from sys");
//ResultSet rs12=st12.executeQuery("select Supplier_ID from supplier");
while(rs12.next())
{
id2.addItem(rs12.getString("Configure_ID"));
}
st12.close();
c12.close();
}
catch(Exception e12)
{
System.out.println(e12);
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String a1=t1.getText();
String a2=id1.getSelectedItem().toString();
String a3=t3.getText();
String a4=t4.getText();
String a5=t5.getText();
String a6=t6.getText();
String a7=t7.getText();
String a8=t8.getText();
String a9=t9.getText();
String a10=t10.getText();
String a11=t11.getText();
String a12=t12.getText();
String a13=t13.getText();
String a14=t14.getText();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cc=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st=cc.createStatement();
st.executeUpdate("insert into sys values("+a1+", "+a2+", '"+a3+"', '"+a4+"', '"+a5+"', '"+a6+"', '"+a7+"', '"+a8+"', '"+a9+"', '"+a10+"','"+a11+"', '"+a12+"', "+a13+", "+a14+")");
st.close();
cc.close();
JOptionPane.showMessageDialog(this, "One record inserted");
}
catch(Exception ee)
{
System.out.println(ee);
JOptionPane.showMessageDialog(this, "Configure_ID already exists");
}
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new dsys().setVisible(true);
}
if(ae.getSource()==b3)
{
t1.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
t12.setText("");
t13.setText("");
t14.setText("");
}
if(ae.getSource()==b4)
{
this.setVisible(false);
new pse().setVisible(true);
}
}
public void itemStateChanged(ItemEvent ie)
{
}
public static void main(String www[])
{
new com();
}
}