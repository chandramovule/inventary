import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
public class ev extends JFrame implements ActionListener
{
JMenuBar menubar;
JMenu m1, m2;
String SMSGBOX_TITLE="Stock management system for computer peripherals";
JMenuItem i1, i2,i3;
Container c;
public ev()
{
setSize(getToolkit().getScreenSize());
setTitle("Stock Management System For Computer Peripherals");
setVisible(true);
setLayout(null);
menubar=new JMenuBar();
m1=new JMenu("Employee Master");
m2=new JMenu("Help");
i1=new JMenuItem("Billing");
i1.setAccelerator(KeyStroke.getKeyStroke('b'));
i1.addActionListener(this);
i2=new JMenuItem("Stock Status");
i2.setAccelerator(KeyStroke.getKeyStroke('s'));
i2.addActionListener(this);
i3=new JMenuItem("HELP");
i3.setAccelerator(KeyStroke.getKeyStroke('h'));
i3.addActionListener(this);
m1.add(i1);
m1.add(i2);
m2.add(i3);
menubar.add(m1);
menubar.add(m2);
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
new bill().setVisible(true);
}

if(ae.getSource()==i2)
{
new ss().setVisible(true);
}

if(ae.getSource()==i3)
{
new hel().setVisible(true);
}

}
public static void main(String m[])
{
new ev();
}
}