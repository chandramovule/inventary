import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.event.*;
import java.sql.*;
public class employee extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l71;
JTextField t1,t2,t3,t5,t7,t61,t6;
JComboBox dw,mmw,yw,q1;
JRadioButton m,f;
JButton b1,b2,b3,b4,b5,b6,b7;
JTextArea t4;
Container c1;
String[] q={"BSC","BCA","BCOM","BBA"};
String[] ddd={ "date","1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11", "12", "13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", "24", "25", "26", "27", "28", "29","30","31"  };
String[] mmm={"month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11", "12"  };
String[] yy={"year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
employee()
{
setSize(700,700);
setTitle("EMPLOYEE DETAILS");
setVisible(true);
setLayout(null);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-700)/2,((screen.height-700)/2));
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//lables && textfields
l1=new JLabel("ID");
l1.setBounds(10,50,110,30);
t1=new JTextField(10);
t1.setBounds(200,50,100,30);

l2=new JLabel("NAME");
l2.setBounds(10,100,100,30);
t2=new JTextField(20);
t2.setBounds(200,100,100,30);

l3=new JLabel("AGE");
l3.setBounds(10,150,100,30);
t3=new JTextField(10);
t3.setBounds(200,150,100,30);

l4=new JLabel("SEX");
l4.setBounds(10,200,100,30);
m=new JRadioButton("Male");
m.setBounds(200,200,100,20);
f=new JRadioButton("Female");
f.setBounds(400,200,100,20);
ButtonGroup bg=new ButtonGroup();
bg.add(m);
bg.add(f);

l5=new JLabel("ADDRESS");
l5.setBounds(10,250,100,30);
t4= new JTextArea();
t4.setBounds(200,250,200,40);

l6=new JLabel("CELL_NO");
l6.setBounds(10,300,100,30);
t5=new JTextField(20);
t5.setBounds(200,300,100,30);
l7=new JLabel("EMAIL_ID");
l7.setBounds(10,350,120,30);
t6=new JTextField(20);
t6.setBounds(200,350,100,30);
l8=new JLabel("QUALIFICATION");
l8.setBounds(10,400,100,30);
q1=new JComboBox(q);
q1.setBounds(200,400,100,30);

l71=new JLabel("EXPERIENCE");
l71.setBounds(10,450,120,30);
t61=new JTextField(10);
t61.setBounds(200,450,100,30);
l10=new JLabel("SALARY");
l10.setBounds(10,500,100,30);
t7=new JTextField(10);
t7.setBounds(200,500,100,30);
l9=new JLabel("JOINDATE");
l9.setBounds(10,550,150,30);
dw=new JComboBox(ddd);
mmw=new JComboBox(mmm);
yw=new JComboBox(yy);
dw.setBounds(200,550,60,20);
mmw.setBounds(280,550,60,20);
yw.setBounds(360,550,60,20);

b1=new JButton("Add");
b1.setBounds(0,600,100,30);
b2=new JButton("Delete");
b2.setBounds(110,600,100,30);
b3=new JButton("Clear");
b3.setBounds(220,600,100,30);
b4=new JButton("View All");
b4.setBounds(330,600,100,30);
b5=new JButton("Back");
b5.setBounds(440,600,100,30);
b6=new JButton("Exit");
b6.setBounds(550,600,100,30);


//adding in container
c1=getContentPane();
c1.setBackground(Color.pink);
		c1.add(l1);
		c1.add(t1); 
		c1.add(l2);
		c1.add(t2);
		c1.add(l3);
		c1.add(t3);
		c1.add(l4);
		c1.add(m);
		c1.add(f);
		c1.add(l5);
		c1.add(t4);
		c1.add(l6);
		c1.add(t5);
		c1.add(l7);
		c1.add(t6); 
		c1.add(l8);
                                          c1.add(q1);
	                     c1.add(l71);
                                          c1.add(t61);
                                          c1.add(l10);
                                          c1.add(t7);
                                          c1.add(l9);
		c1.add(dw);
		c1.add(mmw);
		c1.add(yw);
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

if(ae.getSource()==b1) //add
{
String a1=t1.getText();
String a2=t2.getText();
String a3=t3.getText();
String a4=null;
//System.out.println("bvnbvn");
if(f.isSelected()==true)
{
a4="female";
}
else 
{
a4="male";
}
String a5=t4.getText();
//System.out.println("bvnbvn");
String a6=t5.getText();
String a13=t6.getText();
int i1=q1.getSelectedIndex();
String a7=q[i1];
String a8=t61.getText();
String a10=t7.getText();
int i3=dw.getSelectedIndex();
int i4 =mmw.getSelectedIndex();
int i5 =yw.getSelectedIndex();
String a9 =ddd[i3]+"/"+mmm[i4]+"/"+yy[i5];
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:sss","root","");
Statement st=c.createStatement();
int i=st.executeUpdate("insert into employee values("+a1+",'"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a13+"','"+a7+"','"+a8+"','"+a10+"','"+a9+"')");
if(i==1)
{
JOptionPane.showMessageDialog(this,"One Record Inserted","Success",JOptionPane.INFORMATION_MESSAGE);
}
st.close();
c.close();
}
catch(Exception ex)
{
System.out.println("sql exception:"+ex.getMessage());
JOptionPane.showMessageDialog(this, "ID already exists");
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
int i=st.executeUpdate("delete from employee where ID="+a1+"");
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
String a4=null;
if((f.isSelected()==true)||(m.isSelected()==true))
{
f.setSelected(false);
}
else
{
m.setSelected(false);
}
t4.setText("");
t5.setText("");
t6.setText("");
t61.setText("");
t7.setText("");
}
if(ae.getSource()==b4) //view all
{
this.setVisible(false);
new empintable().setVisible(true);
}

if(ae.getSource()==b5) //back
{
this.setVisible(false);
new ov().setVisible(true);
}

if(ae.getSource()==b6) //exit
{
System.exit(0);
}
}
/*
public static void main(String s[])
{
employee obj=new employee();
obj.setVisible(true);
}
*/
}
