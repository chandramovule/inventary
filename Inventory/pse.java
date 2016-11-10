import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class pse extends JFrame implements ActionListener
{
JTabbedPane tabbedpane;
JPanel hardware;
JPanel software;
JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
public pse()
{
setTitle("Purchase Entry");
setSize(500, 550);
setVisible(true);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2,((screen.height-500)/2));
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
JLabel l7=new JLabel("NEW LAPTOP");
l7.setBounds(60 , 60, 150, 25);
hardware.add(l7);
JLabel l8=new JLabel("EXISTING LAPTOP");
l8.setBounds(60, 120, 150, 25);
hardware.add(l8);
JLabel l1=new JLabel("NEW SYSTEM");
l1.setBounds(60, 180, 150, 25);
hardware.add(l1);
JLabel l2=new JLabel("EXISTING SYSTEM");
l2.setBounds(60, 240, 150 ,25);
hardware.add(l2);
JLabel l5=new JLabel("NEW PERIPHERAL");
l5.setBounds(60,300, 150, 25);
hardware.add(l5);
JLabel l6=new JLabel("EXISTING PERIPHERAL");
l6.setBounds(60, 360, 150, 25);
hardware.add(l6);
b11=new JButton("Purchase");
b11.setBounds(250, 60, 100, 25);
hardware.add(b11);
b12=new JButton("Purchase");
b12.setBounds(250, 120, 100, 25);
hardware.add(b12);
b1=new JButton("Purchase");
b1.setBounds(250, 180, 100, 25);
hardware.add(b1);
b2=new JButton("Purchase");
b2.setBounds(250, 240, 100, 25);
hardware.add(b2);
b9=new JButton("Purchase");
b9.setBounds(250, 300, 100, 25);
hardware.add(b9);
b10=new JButton("Purchase");
b10.setBounds(250, 360, 100, 25);
hardware.add(b10);
b5=new JButton("Back");
b5.setBounds(125, 430, 75,25);
hardware.add(b5);
b6=new JButton("Exit");
b6.setBounds(225, 430, 75,25);
hardware.add(b6);
b11.addActionListener(this);
b12.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
}
public void createPage2()
{
software=new JPanel();
software.setLayout(null);
software.setBackground(Color.pink);
JLabel l3=new JLabel("NEW ITEM");
l3.setBounds(60,60, 150, 25);
software.add(l3);
JLabel l4=new JLabel("EXISTING ITEM");
l4.setBounds(60, 120, 150, 25);
software.add(l4);
b3=new JButton("Purchase");
b3.setBounds(250, 60, 100, 25);
software.add(b3);
b4=new JButton("Purchase");
b4.setBounds(250, 120, 100, 25);
software.add(b4);
b7=new JButton("Back");
b7.setBounds(125, 200, 75,25);
software.add(b7);
b8=new JButton("Exit");
b8.setBounds(225, 200, 75,25);
software.add(b8);
b3.addActionListener(this);
b4.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b11)
{
this.setVisible(false);
new lap().setVisible(true);
}
if(ae.getSource()==b12)
{
this.setVisible(false);
new elap().setVisible(true);
}
if(ae.getSource()==b1)
{
this.setVisible(false);
new com().setVisible(true);
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new exi().setVisible(true);
}
if(ae.getSource()==b3)
{
System.out.println("aa");
this.setVisible(false);
new pns().setVisible(true);
}
if(ae.getSource()==b4)
{
System.out.println("ccccccccccaa");
this.setVisible(false);
new pes().setVisible(true);
}
if(ae.getSource()==b5)
{
this.setVisible(false);
new ov().setVisible(true);
}
if(ae.getSource()==b6)
{
System.exit(0);
}
if(ae.getSource()==b7)
{
this.setVisible(false);
new ov().setVisible(true);
}
if(ae.getSource()==b8)
{
System.exit(0);
}
if(ae.getSource()==b9)
{
this.setVisible(false);
new pnh().setVisible(true);
}
if(ae.getSource()==b10)
{
this.setVisible(false);
new peh().setVisible(true);
}
}
public static void main(String ttt[])
{
new pse();
}
}