import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
public class peh extends JFrame implements ActionListener, ItemListener
{
JLabel l1, l2, l3, l4, l5, l6;
JTextField t1, t2, t3, t4;
JComboBox j;
JButton b1, b2, b3;
Container c;
public peh()
{
setSize(500, 500);
setTitle("Purchase entry for existing Peripherals");
setVisible(true);
setLayout(null);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2,((screen.height-350)/2));
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
l1=new JLabel("Purchase_ID");
l1.setBounds(30,50, 80, 30);
l2=new JLabel("Supplier_ID");
l2.setBounds(30, 100, 80, 30);
l3=new JLabel("Type");
l3.setBounds(30, 150, 80, 30);
l4=new JLabel("Description");
l4.setBounds(30, 200, 80, 30);
l5=new JLabel("with size and model");
l5.setBounds(20, 210, 130, 30);
l6=new JLabel("Quantity");
l6.setBounds(30, 250, 100, 30);
t1=new JTextField(10);
t1.setBounds(200, 50, 100, 30);
t1.setEditable(false);
t2=new JTextField(10);
t2.setBounds(200, 100, 100, 30);
t2.setEditable(false);
t3=new JTextField(20);
t3.setBounds(200, 150, 100, 30);
t3.setEditable(false);
j=new JComboBox();
j.addItem("Select");
j.setBounds(200, 200, 200, 30);
j.addItemListener(this);
t4=new JTextField(10);
t4.setBounds(200, 250, 100, 30);
b1=new JButton("Add");
b1.setBounds(50, 350, 80, 30);
b2=new JButton("Clear");
b2.setBounds(180, 350, 80, 30);
b3=new JButton("Back");
b3.setBounds(310, 350, 80, 30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
c=getContentPane();
c.setBackground(Color.pink);
c.add(l1);
c.add(t1);
c.add(l2);
c.add(t2);
c.add(l3);
c.add(t3);
c.add(l4);
c.add(l5);
c.add(j);
c.add(l6);
c.add(t4);
c.add(b1);
c.add(b2);
c.add(b3);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cc=DriverManager.getConnection("jdbc:odbc:sss", "root","");
Statement st=cc.createStatement();
ResultSet rs=st.executeQuery("select Description from hard1");
while(rs.next())
{
j.addItem(rs.getString("Description"));
}
st.close();
cc.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
public void itemStateChanged(ItemEvent ie)
{
String s1=j.getSelectedItem().toString();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st1=c1.createStatement();
ResultSet rs1=st1.executeQuery("select Purchase_ID, Supplier_ID, Type from hard1 where Description='"+s1+"'");
while(rs1.next())
{
t1.setText(rs1.getString("Purchase_ID"));
t2.setText(rs1.getString("Supplier_ID"));
t3.setText(rs1.getString("Type"));
}
st1.close();
c1.close();
}
catch(Exception e1)
{
System.out.println(e1);
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
int a=Integer.parseInt(t1.getText());
int a1=Integer.parseInt(t2.getText());
String a2=t3.getText();
String a3=j.getSelectedItem().toString();
int a4=Integer.parseInt(t4.getText());
int x, x1;
x=0;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c2=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st2=c2.createStatement();
//PreparedStatement ps1=c2.prepareStatement("select * from hard1 where Purchase_ID="+a+", Supplier_ID="+a1+",Type='"+a2+"'");
//ResultSet rs3=ps1.executeQuery();
//st2.executeQuery("select * from hard1 where Purchase_ID="+a+", Supplier_ID="+a1+", Type='"+a2+"'");
//ResultSet rs3=st2.executeQuery("select * from hard1 where Purchase_ID="+a+", Supplier_ID="+a1+", Type='"+a2+"'");
ResultSet rs3=st2.executeQuery("select * from hard1 where Purchase_ID="+a+"");
JOptionPane.showMessageDialog(this, "One record inserted");
System.out.println("inserted");
while(rs3.next())
{
x=rs3.getInt("Quantity");
}
x1=x+a4;
PreparedStatement ps4=c2.prepareStatement("update hard1 set Quantity="+x1+" where Purchase_ID="+a+"");
ResultSet rs4=ps4.executeQuery();
st2.close();
c2.close();
}
catch(Exception e2)
{
System.out.println(e2);
}
}
if(ae.getSource()==b2)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
}
if(ae.getSource()==b3)
{
this.setVisible(false);
new pse().setVisible(true);
}
}
public static void main(String qq[])
{
new peh();
}
}
