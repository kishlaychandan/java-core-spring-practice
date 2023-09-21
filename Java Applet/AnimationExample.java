import java.awt.*;
import java.applet.*;
public class AnimationExample extends Applet
{
 Image Pic;
 public void init()
 {
  Pic=getImage(getDocumentBase(),"Screenshot001.png");
 } 
 public void paint(Graphics g)
 {
  for (int i=0;i<100;i++)
  {
   g.drawImage(Pic,i,50,this);
   try
   {
    Thread.sleep(50);
   }
   catch (Exception e){
   }
  }
}  
}