import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public  class hel extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7;
JButton b1;
Container c;
public hel()
{
setSize(300, 350);
setVisible(true);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-300)/2, ((screen.height-350)/2));
setLayout(null);
l1=new JLabel("Shortcut keys");
l1.setBounds(100, 40, 100, 30);
l2=new JLabel("Press 'b':");
l2.setBounds(30, 90, 75, 25);
l3=new JLabel("'b' for Billing");
l3.setBounds(150, 90,250,25);
l4=new JLabel("Press 's':");
l4.setBounds(30, 120, 75, 25);
l5=new JLabel("'s' for Stock Status");
l5.setBounds(150, 120, 250, 25);
l6=new JLabel("Press 'h':");
l6.setBounds(30, 150, 75, 25);
l7=new JLabel("'h' for Help");
l7.setBounds(150, 150, 250, 25);
b1=new JButton("OK");
b1.setBounds(90, 200, 75,25);
c=getContentPane();
c.setBackground(Color.pink);
c.add(l1);
c.add(l2);
c.add(l3);
c.add(l4);
c.add(l5);
c.add(l6);
c.add(l7);
c.add(b1);
b1.addActionListener(this);
} 
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.setVisible(false);
new ev().setVisible(true);
}
}
public static void main(String e[])
{
new hel();
}
}
