import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.border.*;
public class prjj extends JFrame implements ActionListener
{
JButton b1,b2;
Container c;
JLabel l1,l2;
Font f;
Splash s=new Splash();
Thread t=new Thread(s);
public prjj()
{
//setSize(getToolkit().getScreenSize());
setSize(700,600);
Dimension screen=(Toolkit.getDefaultToolkit().getScreenSize());
setLocation((screen.width-700)/2,((screen.height-600)/2));
setDefaultCloseOperation(EXIT_ON_CLOSE);
//JFrame.setDefaultLookAndFeelDecorated(true);
loadSplashScreen();
s.dispose();
setVisible(true);
setLayout(null);
l1=new JLabel("Welcome To Owner");
l2=new JLabel("And Employee");
f=new Font("Monotype Corsiva", Font.BOLD,50);
l1.setForeground(Color.red);
l2.setForeground(Color.red);
l1.setFont(f);
l2.setFont(f);
b1=new JButton("Owner Login");
b2=new JButton("Employee Login");
b1.addActionListener(this);
b2.addActionListener(this);
l1.setBounds(120,80,400,30);
l2.setBounds(170,160,400,40);
b1.setBounds(240,250,150,30);
b2.setBounds(240,320,150,30);
c=getContentPane();
c.setBackground(Color.CYAN);
c.add(l1);
c.add(l2);
c.add(b1);
c.add(b2);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
new owlog().setVisible(true);
}
if(ae.getSource()==b2)
{
new emplo().setVisible(true);
}
}
protected void loadSplashScreen()
{
t.start();
while(!s.isShowing())
{
try
{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
}
}
}
public static void main(String p[])
{
new prjj();
}
}