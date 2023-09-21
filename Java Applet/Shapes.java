import java.applet.*;
import java.awt.*;
public class Shapes extends Applet
{
 int x=300,y=100,r=50;
 public void paint(Graphics g)
 {
  Color c=new Color (240,1,0,100);
  g.drawline(30,300,200,10);
  g.setColor(c);
  g.drawOval(x-r,y-r,100,100);
  g.drawRect(100,100,200,200);
 }
} 

 