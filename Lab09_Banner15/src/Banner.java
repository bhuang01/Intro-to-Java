// This applet displays a message moving horizontally
// across the screen.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Banner extends JApplet
  implements ActionListener
{
  private int xPos, yPos;  // hold the coordinates of the banner

  public void init()
  {
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    xPos = c.getWidth();
    yPos = c.getHeight() / 2;
    Timer clock = new Timer(20, this);  // fires every 30 milliseconds 
    clock.start();
  }

  // Called automatically after a repaint request
  public void paint(Graphics g)
  {
	int xCenter = getWidth();
	int yCenter = getHeight();
    super.paint(g);
    
    //g.drawString("Hello, World!", xPos, yPos); 
    g.setColor(Color.BLACK);
    g.fillRect(xPos, yPos, 100, 50);
    //g.fillRect(xCenter, yCenter, xPos, yPos); 
  }

  // Called automatically when the timer fires
  public void actionPerformed(ActionEvent e)
  {
    Container c = getContentPane();

    // Adjust the horizontal position of the banner:
    xPos = xPos - 3;
    if (xPos < -100)
    {
      xPos = c.getWidth();
    }
    
//    if (xPos < 0 || xPos + 100 > getWidth()) {
//    	boolean touchedWall = true;
//    	if (touchedWall) {
//    		xPos = xPos + 6;
//    	}
//    	else {
//    		touchedWall = false;
//    	}
//    	if (!touchedWall) {
//    		xPos = xPos - 3;
//    	}
//    }
    
    // Set the vertical position of the banner:
    yPos = c.getHeight() / 2;

    repaint();
  }
}


