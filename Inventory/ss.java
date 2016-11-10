import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class ss extends JFrame implements ActionListener
{
JTabbedPane tabbedpane;
JPanel h;
JPanel s;
JButton b1,b2,b3,b4,b5,b6,b7,b8;
public ss()
{
setTitle("Stock Status");
setSize(500, 500);
setVisible(true);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-500)/2,((screen.height-350)/2));
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setBackground(Color.pink);
JPanel p1=new JPanel();
p1.setLayout(new BorderLayout());
getContentPane().add(p1);
createPage1();
createPage2();
tabbedpane=new JTabbedPane();
tabbedpane.addTab("HARDWARE", h);
tabbedpane.addTab("SOFTWARE",s);
p1.add(tabbedpane, BorderLayout.CENTER);
}
public void createPage1()
{
h=new JPanel();
h.setLayout(null);
h.setBackground(Color.pink);
JLabel l3=new JLabel("LAPTOP");
l3.setBounds(60, 100, 150, 25);
h.add(l3);
b7=new JButton("View all");
b7.setBounds(250, 60, 100, 25);
h.add(b7);
b7.addActionListener(this);
b8=new JButton("Particular");
b8.setBounds(250, 120, 100, 25);
h.add(b8);
b8.addActionListener(this);
JLabel l1=new JLabel("SYSTEM");
l1.setBounds(60,220, 150,25);
h.add(l1);
b1=new JButton("View all");
b1.setBounds(250, 180, 100, 25);
h.add(b1);
b1.addActionListener(this);
b2=new JButton("Particular");
b2.setBounds(250, 240, 100, 25);
h.add(b2);
b2.addActionListener(this);
JLabel l2=new JLabel("PERIPHERALS");
l2.setBounds(60, 340, 150, 25);
h.add(l2);
b5=new JButton("View all");
b5.setBounds(250, 300, 100, 25);
b5.addActionListener(this);
h.add(b5);
b6=new JButton("Particular");
b6.setBounds(250, 360, 100, 25);
b6.addActionListener(this);
h.add(b6);
}
public void createPage2()
{
s=new JPanel();
s.setLayout(null);
s.setBackground(Color.pink);
JLabel l2=new JLabel("SOFTWARE");
l2.setBounds(60,100, 150,25);
s.add(l2);
b3=new JButton("View all");
b3.setBounds(250, 60, 100, 25);
s.add(b3);
b3.addActionListener(this);
b4=new JButton("Particular");
b4.setBounds(250, 120, 100, 25);
s.add(b4);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b7)
{
this.setVisible(false);
new evlap().setVisible(true);
}
if(ae.getSource()==b8)
{
this.setVisible(false);
new eplap().setVisible(true);
}
if(ae.getSource()==b1)
{
this.setVisible(false);
new evsy().setVisible(true);
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new epsy().setVisible(true);
}
if(ae.getSource()==b5)
{
this.setVisible(false);
new evah().setVisible(true);
}
if(ae.getSource()==b6)
{
this.setVisible(false);
new eph().setVisible(true);
}
if(ae.getSource()==b3)
{
this.setVisible(false);
new evas().setVisible(true);
}
if(ae.getSource()==b4)
{
this.setVisible(false);
new eps().setVisible(true);
}
}
public static void main(String q[])
{
new ss();
}
}