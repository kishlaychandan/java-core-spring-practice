import java.awt.*;
import java.applet.*;
public class DisplayImage extends Applet
{
 Image Picture;
 public void init(){
 Picture=getImage(getDocumentBase(),"screenshot001.png");
 }
 public void paint (Graphics g)
 {
	 g.drawImage(Picture,300,300,this);
 }
}