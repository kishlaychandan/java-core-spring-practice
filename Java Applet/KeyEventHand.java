import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KeyEventHand extends Applet implements KeyListener
{
 String msg ="";
 public void init()
  {
   addKeyListener(this);
  }
  public void keyPressed(KeyEvent k)
  {
   showStatus("key pressed");
  }
  public void keyReleased(KeyEvent k)
  {
   showStatus("key Released");
  }
  public void keyTyped(KeyEvent k)
  {
   msg= msg+k.getKeyChar();
   repaint();
  }
  public void paint(Graphics g)
  {
	  g.drawString(msg,10,20);
  }
}
