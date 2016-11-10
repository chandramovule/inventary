import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
public class pes extends JFrame implements ActionListener, ItemListener
{
JLabel l1,l2,l3,l4;
JTextField t1,t2,t4;
JComboBox j;
JButton b1,b2,b3,b4;
Container c;
public pes()
{
setSize(500,500);
setTitle("Purchase entry for existing software");
setVisible(true);
setLayout(null);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2,((screen.height-350)/2));
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
l1=new JLabel("Purchase_ID");
l1.setBounds(50,40,80,50);
l2=new JLabel("Supplier_ID");
l2.setBounds(50,100,80,50);
l3=new JLabel("Description");
l3.setBounds(50,160,80,50);
l4=new JLabel("Quantity");
l4.setBounds(50,220,80,50);
//l5=new JLabel("Price");
//l5.setBounds(50,200,80,50);
t1=new JTextField(5);
t1.setBounds(200,40,110,30);
t2=new JTextField(5);
t2.setBounds(200,100,110,30);
t4=new JTextField(5);
t4.setBounds(200,220,110,30);
//t5=new JTextField(5);
//t5.setBounds(200,200,110,40);
j=new JComboBox();
j.addItem("Select");
j.setBounds(200,160,110,30);
j.addItemListener(this);
b1=new JButton("Add");
b1.setBounds(50,350,80,30);
b2=new JButton("Clear");
b2.setBounds(180,350,80,30);
b3=new JButton("Back");
b3.setBounds(330,350,80,30);
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
c.add(j);
c.add(l4);
c.add(t4);
//c.add(l5);
//c.add(t5);
c.add(b1);
c.add(b2);
c.add(b3);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cc=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=cc.createStatement();
ResultSet rs=st.executeQuery("select Description from soft");
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
public void itemStateChanged(ItemEvent e)
{
String s1=j.getSelectedItem().toString();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st1=c1.createStatement();
ResultSet rs1=st1.executeQuery("select Purchase_ID, Supplier_ID from soft where Description='"+s1+"'");
while(rs1.next())
{
t1.setText(rs1.getString("Purchase_ID"));
t2.setText(rs1.getString("Supplier_ID"));
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
String a2=j.getSelectedItem().toString();
int a3=Integer.parseInt(t4.getText());
//int a4=Integer.parseInt(t5.getText());
int x,x1;
x=0;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c2=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st2=c2.createStatement();
PreparedStatement ps1=c2.prepareStatement("select * from soft where Purchase_ID="+a+" and Supplier_ID="+a1+"");
ResultSet rs3=ps1.executeQuery();
JOptionPane.showMessageDialog(this, "One record inserted");
while(rs3.next())
{
x=rs3.getInt("Quantity");
}
x1=x+a3;
PreparedStatement ps4=c2.prepareStatement("update soft set Quantity="+x1+" where Purchase_ID="+a+"");
ResultSet rs4=ps4.executeQuery();

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
t4.setText("");
}
if(ae.getSource()==b3)
{
this.setVisible(false);
new pse().setVisible(true);
}
}
public static void main(String aaa[])
{
new pes();
}
}




