import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
public class sr extends JFrame implements ActionListener
{
JTabbedPane t;
JPanel va;
JPanel vp;
JButton b1, b2;
public sr()
{
setTitle("Sales Report");
setSize(400, 350);
setVisible(true);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((screen.width-400)/2, ((screen.height-350)/2));
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
setBackground(Color.pink);
JPanel p1=new JPanel();
p1.setLayout(new BorderLayout());
getContentPane().add(p1);
createPage1();
createPage2();
t=new JTabbedPane();
t.addTab("FEW DAYS", va);
t.addTab("PARTICULAR DAYS", vp);
p1.add(t, BorderLayout.CENTER);
}
public void createPage1()
{
va=new JPanel();
va.setLayout(null);
va.setBackground(Color.pink);
JLabel l1=new JLabel("Report for few days to:");
l1.setBounds(30, 120, 200, 25);
va.add(l1);
 b1=new JButton("VIEW");
b1.setBounds(200, 120, 100, 25);
va.add(b1);
b1.addActionListener(this);
}
public void createPage2()
{
vp=new JPanel();
vp.setLayout(null);
vp.setBackground(Color.pink);
JLabel l2=new JLabel("Report for particular day to:");
l2.setBounds(30, 120, 200, 25);
vp.add(l2);
b2=new JButton("VIEW");
b2.setBounds(200, 120, 100, 25);
vp.add(b2);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
this.setVisible(false);
new vfd().setVisible(true);
}
if(ae.getSource()==b2)
{
this.setVisible(false);
new vpd().setVisible(true);
}
}
public static void main(String w[])
{
new sr();
}
}

