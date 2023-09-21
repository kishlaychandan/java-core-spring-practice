import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyAppletButton extends Applet implements ActionListener{
    Button b1=new Button("ok");
    Button b2=new Button("submit");
    Button b3 = new Button("cancel");
    String str="";
    public void init()
    {
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(str,20, 50);    
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            str="ok button clicked";
        else if(e.getSource()==b2)
            str="submit button clicked";
        else
        str="cancle button clicked";
        repaint();
    }
}