import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Banner extends JApplet
  implements ActionListener
{
	private int msgID = 1;
	private int xPos, yPos;  // hold the coordinates of the banner
	Timer clock1; //Creates clock 1
	Timer clock2; //Creates clock 2
  
  public void init()
  {
	Container c = getContentPane();
    c.setBackground(Color.WHITE);
    xPos = c.getWidth();
    yPos = c.getHeight() / 2;
    clock1 = new Timer(30, this);  // Clock 1 fires every 30 milliseconds
    clock1.start();   
    clock2 = new Timer (2000, this); // Clock 2 fires every 2 seconds
    clock2.start();
  }
  // Called automatically after a repaint request
  public void paint(Graphics g)
  {  
	super.paint(g);
	
    g.setColor(Color.BLACK);
    g.fillRect(xPos-20, yPos-20, 150, 80);
    g.setColor(Color.RED);
    
    if (msgID == 1)
    {
    	 g.drawString("Java is Best!", xPos + 25, yPos + 30); 
    }
    else // if msgID == -1
    {
    	 g.drawString("East or West", xPos + 25, yPos + 30); 
    }
  }
  // Creates text that says "Java is Best," and also "East or West"
  // Called automatically when the timer fires
  public void actionPerformed(ActionEvent e)  {
	  
    if (e.getSource() ==clock1) { 
    	//Checks to see if first clock is fired
	  Container c = getContentPane();
  
    // Adjust the horizontal position of the banner:
    xPos -= 5;
    if (xPos < -100) {
    
      xPos = c.getWidth();
    }

    // Set the vertical position of the banner:
    yPos = c.getHeight() / 2;
    } else {
    //Calls other clock
    msgID = -msgID;
    }
    repaint();
  }
 
 //g.drawString("Hello, World!", xPos, yPos); 
 //Color myColor = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
 //g.setColor(myColor);

 //Container c = getContentPane();

 // Adjust the horizontal position of the banner:
 
// if (xPos < 0 || xPos + 100 > getWidth()) {
// 	boolean touchedWall = true;
// 	if (touchedWall) {
// 		xPos = xPos + 6;
// 	}
// 	else {
// 		touchedWall = false;
// 	}
// 	if (!touchedWall) {
// 		xPos = xPos - 3;
// 	}
// }
 
 // Set the vertical position of the banner:

}


