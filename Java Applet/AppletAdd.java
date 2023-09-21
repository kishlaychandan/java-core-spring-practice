import java.awt.*;
import java.applet.*;
public class AppletAdd extends Applet
{
TextField text1,text2,total;
 
public void init(){
 text1=new TextField(8);
 text2=new TextField(8);
 total=new TextField(8);
 add(text1);
 add(text2);
 add(total);
 text1.setText("0");
 text2.setText("0");
 }
public void paint(Graphics g)
{
 int x=0,y=0,z=0;
 String s1,s2,s;
 g.drawString("Input a no. in each box" ,10,50);
 try{
  s1=text1.getText();
  x=Integer.parseInt(s1);
  s2=text2.getText();
  y=Integer.parseInt(s2);
 }
 catch(Exception e)
 {
 z=x+y;
 s=String.valueOf(z);
 g.drawString("the sum is:",10,50);
 g.drawString(s,100,75);
 }
 
 /*public Boolean Action (Event event ,Object object){
 repaint();
 return true;
 }*/
 }
}