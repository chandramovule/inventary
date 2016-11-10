import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class help extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l0,l13;
JButton b1;
Container c;
public help()
{
setSize(400,450);
setVisible(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-400)/2,((screen.height-450)/2));
setLayout(null);
l1=new JLabel("Shortcut keys");
l1.setBounds(150,10,100,30);
//l2=new JLabel("Press 'h':");
//l2.setBounds(10, 60, 75, 25);
l3=new JLabel("Press 's':");
l3.setBounds(10, 60,75,25);
l4=new JLabel("Press 'p':");
l4.setBounds(10,90, 75,25);
l5=new JLabel("Press 'e':");
l5.setBounds(10,120,75,25);
l6=new JLabel("Press 'r':");
l6.setBounds(10, 150, 75,25);
l7=new JLabel("Press 't':");
l7.setBounds(10, 180, 75,25);
l0=new JLabel("Press 'h':");
l0.setBounds(10, 210, 75, 25);
l8=new JLabel("'s' for Purchase Entry");
l8.setBounds(150, 60, 250, 25);
l9=new JLabel("'p' for Supplier Entry");
l9.setBounds(150, 90, 250,25);
l10=new JLabel("'e' for Employee Entry");
l10.setBounds(150, 120,250, 25);
l11=new JLabel("'r' for Stock Report");
l11.setBounds(150, 150, 250, 25);
l12=new JLabel("'t' for Sales Report");
l12.setBounds(150, 180, 250, 25);
l13=new JLabel("'h' for Help");
l13.setBounds(150, 210, 250, 25);
b1=new JButton("OK");
b1.setBounds(150, 250, 75,25);
c=getContentPane();
c.setBackground(Color.pink);
c.add(l1);
c.add(l3);
c.add(l4);
c.add(l5);
c.add(l6);
c.add(l7);
c.add(l0);
c.add(l8);
c.add(l9);
c.add(l10);
c.add(l11);
c.add(l12);
c.add(l13);
c.add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.setVisible(false);
new ov().setVisible(true);
}
}
public static void main(String h[])
{
new help();
}
}



