import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class bill extends JFrame implements ActionListener
{
JTabbedPane tabbedpane;
JPanel hardware;
JPanel software;
JButton b1,b2,b3,b4,b5,b6,b7;
public bill()
{
setTitle("Billing");
setSize(400, 450);
setVisible(true);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-400)/2,((screen.height-450)/2));
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setBackground(Color.pink);
JPanel p1=new JPanel();
p1.setLayout(new BorderLayout());
getContentPane().add(p1);
createPage1();
createPage2();
tabbedpane=new JTabbedPane();
tabbedpane.addTab("HARDWARE", hardware);
tabbedpane.addTab("SOFTWARE", software);
p1.add(tabbedpane, BorderLayout.CENTER);
}
public void createPage1()
{
hardware=new JPanel();
hardware.setLayout(null);
hardware.setBackground(Color.pink);
JLabel l1=new JLabel("BILLING FOR HARDWARE");
l1.setBounds(130,20,200, 25);
hardware.add(l1);
b6=new JButton("Laptop");
b6.setBounds(140, 80, 110, 25);
b6.addActionListener(this);
hardware.add(b6);
b1=new JButton("System");
b1.setBounds(140,140,110, 25);
b1.addActionListener(this);
hardware.add(b1);
b2=new JButton("Peripherals");
b2.setBounds(140,200, 110, 25);
b2.addActionListener(this);
hardware.add(b2);
b3=new JButton("Back");
b3.setBounds(90,290, 90, 25);
b3.addActionListener(this);
hardware.add(b3);
b7=new JButton("Exit");
b7.setBounds(210, 290, 90, 25);
b7.addActionListener(this);
hardware.add(b7);
}
public void createPage2()
{
software=new JPanel();
software.setLayout(null);
software.setBackground(Color.pink);
JLabel l2=new JLabel("BILLING FOR SOFTWARE");
l2.setBounds(120, 30, 200, 25);
software.add(l2);
b4=new JButton("Software");
b4.setBounds(130, 100, 130, 25);
b4.addActionListener(this);
software.add(b4);
b5=new JButton("Back");
b5.setBounds(130, 150, 130, 25);
b5.addActionListener(this);
software.add(b5);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b6)
{
this.setVisible(false);
new bill5().setVisible(true);
}
if(ae.getSource()==b1)
{
this.setVisible(false);
new bill4().setVisible(true);
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new bill3().setVisible(true);
}
if(ae.getSource()==b3)
{
this.setVisible(false);
new ev().setVisible(true);
}
if(ae.getSource()==b4)
{
this.setVisible(false);
new bill2().setVisible(true);
}
if(ae.getSource()==b5)
{
this.setVisible(false);
new bill().setVisible(true);
}
if(ae.getSource()==b7)
{
System.exit(0);
}
}
public static void main(String ee[])
{
new bill();
}
}
