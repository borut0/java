import java.applet.Applet;
import java.awt.*;
/* <applet code = "MyApplet" width="500" height="500"> */ 
public class MyApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("hello word",100,100);
	}
}