import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
public class pns extends JFrame implements ActionListener, ItemListener
{
JLabel l1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4,t5;
JButton b1,b2,b3,b4;
JComboBox  id,id1;
Container c;
public pns()
{
setSize(500,500);
setTitle("Purchase entry for software");
setVisible(true);
setLayout(null);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2,((screen.height-350)/2));
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
l1=new JLabel("Purchase_ID");
l1.setBounds(30,50,80,50);
l2=new JLabel("Supplier_ID");
l2.setBounds(30,100,80,50);
l3=new JLabel("Description");
l3.setBounds(30,150,80,50);
l4=new JLabel("Quantity");
l4.setBounds(30,200,80,50);
l5=new JLabel("Price");
l5.setBounds(30,250,80,50);
id=new JComboBox();
id.addItem("Existing id");
id.addItemListener(this);
id.setBounds(200, 50, 100, 30);
id1=new JComboBox();
id1.addItem("Select");
id1.setBounds(200, 100, 100, 30);
t1=new JTextField(5);
t1.setBounds(310,50,50,30);
//t2=new JTextField(5);
//t2.setBounds(200,80,250,40);
t3=new JTextField(30);
t3.setBounds(200,150,100,30);
t4=new JTextField(10);
t4.setBounds(200,200,100,30);
t5=new JTextField(10);
t5.setBounds(200,250,100,30);
b1=new JButton("Insert");
b1.setBounds(30,370,80,30);
b2=new JButton("Delete");
b2.setBounds(130,370,80,30);
b3=new JButton("Clear");
b3.setBounds(230,370,80,30);
//b5=new JButton("View P_ID");
//b5.setBounds(280, 370, 100,   30);
b4=new JButton("Back");
b4.setBounds(330,370,80,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
//b5.addActionListener(this);
c=getContentPane();
c.setBackground(Color.pink);
c.add(l1);
c.add(id);
c.add(t1);
c.add(l2);
c.add(id1);
//c.add(t2);
c.add(l3);
c.add(t3);
c.add(l4);
c.add(t4);
c.add(l5);
c.add(t5);
c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);
//c.add(b5);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st1=c1.createStatement();
ResultSet rs1=st1.executeQuery("select Purchase_ID from soft");
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
ResultSet rs11=st11.executeQuery("select Supplier_ID from supplier where Supplies='Software' ");
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
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String a1=t1.getText();
//String a2=t2.getText();
String a2=id1.getSelectedItem().toString();
String a3=t3.getText();
String a4=t4.getText();
String a5=t5.getText();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cc=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=cc.createStatement();
st.executeUpdate("insert into soft values("+a1+","+a2+",'"+a3+"',"+a4+","+a5+")");
st.close();
cc.close();
JOptionPane.showMessageDialog(this, "One record inserted");
}
catch(Exception ee)
{
System.out.println(ee);
JOptionPane.showMessageDialog(this, "Purchase_ID already exists");
}
}
if(ae.getSource()==b2)
{
String a1=t3.getText();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cc=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=cc.createStatement();
st.executeUpdate("delete from soft where Description='"+a1+"'");
JOptionPane.showMessageDialog(this, "Deleted successfully");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this, "Cannot delete please enter description to delete");
}
}
if(ae.getSource()==b3)
{
t1.setText("");
//t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
}
/*
if(ae.getSource()==b5)
{
this.setVisible(false);
//new vpi().setVisible(true);
}
*/
if(ae.getSource()==b4)
{
this.setVisible(false);
new pse().setVisible(true);
}
}
public void itemStateChanged(ItemEvent ie)
{
}
public static void main(String sss[])
{
new pns();
}
}
