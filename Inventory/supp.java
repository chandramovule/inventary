import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
import java.io.*;
public class supp extends JFrame implements ActionListener
{
JLabel l1, l2,l3, l4,l5, l6;
JTextField t1, t2,t4 ,t5;
JTextArea t3;
JComboBox t;
JButton b1, b2,b3, b4, b5, b6;
Container c1;
String[] tt={"Select", "Hardware", "Software"};
public supp()
{
setSize(500, 450);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2, ((screen.height-450)/2));
setTitle("Supplier Entry");
setVisible(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setLayout(null);
l1=new JLabel("Supplier_ID");
l1.setBounds(60, 60, 150, 40);
l2=new JLabel("Supplier_Name");
l2.setBounds(60, 100, 150, 40);
l3=new JLabel("Supplier_Address");
l3.setBounds(60, 140, 150, 40);
l4=new JLabel("Supplier_Phno");
l4.setBounds(60, 180, 150, 40);
l5=new JLabel("Supplier_EmailID");
l5.setBounds(60, 220,150, 40);
l6=new JLabel("Supplies");
l6.setBounds(60, 260, 150, 40);
t1=new JTextField(5);
t1.setBounds(230, 60, 150, 30);
t2=new JTextField(20);
t2.setBounds(230, 100, 150, 30);
t3=new JTextArea();
t3.setBounds(230, 140, 150, 30);
t4=new JTextField(10);
t4.setBounds(230, 180, 150, 30);
t5=new JTextField(20);
t5.setBounds(230, 220, 150, 30);
t=new JComboBox(tt);
t.setBounds(230, 260, 150, 30);
b1=new JButton("INSERT");
b2=new JButton("DELETE");
b3=new JButton("CLEAR");
b4=new JButton("VIEW ALL");
b5=new JButton("BACK");
b6=new JButton("EXIT");
b1.setBounds(80, 300, 100,30);
b2.setBounds(190, 300, 100, 30);
b3.setBounds(300, 300, 100, 30);
b4.setBounds(80, 350,100, 30);
b5.setBounds(190, 350, 100,30);
b6.setBounds(300, 350, 100,30);
c1=getContentPane();
c1.setBackground(Color.pink);
c1.add(l1);
c1.add(t1);
c1.add(l2);
c1.add(t2);
c1.add(l3);
c1.add(t3);
c1.add(l4);
c1.add(t4);
c1.add(l5);
c1.add(t5);
c1.add(l6);
c1.add(t);
c1.add(b1);
c1.add(b2);
c1.add(b3);
c1.add(b4);
c1.add(b5);
c1.add(b6);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
} 
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1) //insert
{
String a1=t1.getText();
String a2=t2.getText();
String a3=t3.getText();
String a4=t4.getText();
String a5=t5.getText();
int i1=t.getSelectedIndex();
String a6=tt[i1];
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:sss", "root", "");
Statement st=c.createStatement();
st.executeUpdate("insert into supplier values("+a1+", '"+a2+"', '"+a3+"', '"+a4+"', '"+a5+"', '"+a6+"' )");
JOptionPane.showMessageDialog(this, "One record inserted");
st.close();
c.close();
}
catch(Exception e)
{
System.out.println(e);
JOptionPane.showMessageDialog(this, "ID exists");
}
}
if(ae.getSource()==b2) //delete
{
String a1=t1.getText();
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=c.createStatement();
int i=st.executeUpdate("delete from supplier where Supplier_ID="+a1+"");
if(i==1)
{
JOptionPane.showMessageDialog(this, "Deletion is successfully completed");
}
}
catch(Exception e1)
{
System.out.println(e1);
JOptionPane.showMessageDialog(this, "Can't delete please enter ID to delete");
}
}
if(ae.getSource()==b3) //clear
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
}
if(ae.getSource()==b4) //view all
{
this.setVisible(false);
new supview().setVisible(true);
}
if(ae.getSource()==b5) // back
{
this.setVisible(false);
new ov().setVisible(true);
}
if(ae.getSource()==b6) //exit
{
System.exit(0);
}
}
public static void main(String z[])
{
new supp();
}
}