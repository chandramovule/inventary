import javax.swing.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class emplo extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1;
JPasswordField pf;
JButton b1,b2;
Container c;
public emplo()
{
setTitle("EMPLOYEE LOGIN");
setSize(300, 350);
setVisible(true);
l1=new JLabel("UserName");
l2=new JLabel("Password");
t1=new JTextField(20);
pf=new JPasswordField(20);
b1=new JButton("LOGIN");
b2=new JButton("BACK");
c=getContentPane();
c.setBackground(Color.pink);
c.add(l1);
c.add(t1);
c.add(l2);
c.add(pf);
c.add(b1);
c.add(b2);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setLayout(null);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-300)/2,((screen.height-350)/2));
l1.setBounds(30,50,100,25);
t1.setBounds(150,50,100,25);
l2.setBounds(30,100,100,25);
pf.setBounds(150,100,100,25);
//b1.setBounds(200,140,75,25);
b1.setBounds(60,160,70,25);
b2.setBounds(140,160,70,25);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String a=t1.getText();
String b=pf.getText();
if((a.equals("employee")&&b.equals("peripherals"))||(a.equals("emplo")&&b.equals("peri")))
{
this.setVisible(false);
new ev().setVisible(true);
}
else
{
JOptionPane.showMessageDialog(this, "Please Enter Some Values");
}
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new prjj().setVisible(true);
}
}
public static void main(String w[])
{
new emplo();
//String CreateString;
//CreateString="create table ownerlogin(UserName varchar(20), Password varchar(20))";
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c1=DriverManager.getConnection("jdbc:odbc:sss","root","root");
Statement st=c1.createStatement();
//st.executeUpdate(CreateString);
ResultSet rs=st.executeQuery("Select * from emplogin");
while(rs.next())
{
String s=rs.getString("UserName");
String s1=rs.getString("Password");
System.out.println("********");
}
st.close();
c1.close();
}
catch(Exception ex)
{
System.out.println("sql exception"+ex.getMessage());
}
}
}



