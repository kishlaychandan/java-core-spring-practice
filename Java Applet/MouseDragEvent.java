import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MouseDragEvent extends Applet implements MouseMotionListener
{
 public void init()
 {
  addMouseMotionListener(this);
  setBackground(Color.red);
 }
 public void mouseDragged(MouseEvent e)
 { 
  Graphics g=getGraphics();
  g.setColor(Color.white);
  g.fillOval(e.getX(),e.getY(),5,5);
  }
  public void mouseMoved(MouseEvent e){}
  
}