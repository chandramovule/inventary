import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
public class Splash extends JWindow implements Runnable
{
public void run()
{
JLabel SplashLabel=new JLabel(new ImageIcon("sph.jpg"));
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
Color cl=new Color(0,0,0);
SplashLabel.setBorder(new LineBorder(cl,2));
getContentPane().add(SplashLabel, BorderLayout.CENTER);
setSize(700,400);
//setSize(620,370);
//setVisible(true);
setLocation((screen.width-700)/2,((screen.height-400)/2));
//setLocation((screen.width-620)/2,((screen.height-370)/2));
show();
}
public static void main(String a[])
{
new Splash();
}
}
