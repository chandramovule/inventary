import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
public class ov extends JFrame implements ActionListener
{
JMenuBar menubar;
JMenu m1, m2,m3;
String SMSGBOX_TITLE="Stock management system for computer peripherals";
JMenuItem i1, i2,i3,i5,i6,i7;
Container c;
public ov()
{
setSize(getToolkit().getScreenSize());
setTitle("Stock Management System For Computer Peripherals");
setVisible(true);
setLayout(null);
menubar=new JMenuBar();
m1=new JMenu("Owner Master");
m2=new JMenu("Report");
m3=new JMenu("Help");
i1=new JMenuItem("Supplier Entry");
i1.setAccelerator(KeyStroke.getKeyStroke('s'));
i1.addActionListener(this);
i2=new JMenuItem("Purchase Entry");
i2.setAccelerator(KeyStroke.getKeyStroke('p'));
i2.addActionListener(this);
i3=new JMenuItem("Employee Entry");
i3.setAccelerator(KeyStroke.getKeyStroke('e'));
i3.addActionListener(this);
//i4=new JMenuItem("Stock Status");
//i4.addActionListener(this);
i5=new JMenuItem("Stock Report");
i5.setAccelerator(KeyStroke.getKeyStroke('r'));
i5.addActionListener(this);
i6=new JMenuItem("Sales Report");
i6.setAccelerator(KeyStroke.getKeyStroke('t'));
i6.addActionListener(this);
i7=new JMenuItem("HELP");
i7.setAccelerator(KeyStroke.getKeyStroke('h'));
i7.addActionListener(this);
m1.add(i1);
m1.add(i2);
m1.add(i3);
//m1.add(i4);
m2.add(i5);
m2.add(i6);
m3.add(i7);
menubar.add(m1);
menubar.add(m2);
menubar.add(m3);
menubar.setBounds(0,0,1500,30);
c=getContentPane();
c.setBackground(Color.cyan);
c.add(menubar, "North");
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==i1)
{
new supp().setVisible(true);
}
if(ae.getSource()==i2)
{
new pse().setVisible(true);
}
if(ae.getSource()==i3)
{
new employee().setVisible(true);
}

/*
if(ae.getSource()==i4)
{
new ss().setVisible(true);
}
*/

if(ae.getSource()==i5)
{
new str().setVisible(true);
}

if(ae.getSource()==i6)
{
new sr().setVisible(true);
}
if(ae.getSource()==i7)
{
new help().setVisible(true);
}
}
public static void main(String m[])
{
new ov();
}
}