/* Author: Bryan H.
 * Date: 11/07/18
 * Description: Paints a rainbow with multiple colors and evenly spaced
 * Version 2.0
 * Version Notes: Added experimentation with a full scale rainbow (all colors); commented out
 */

import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel
{
	// Declare skyColor:
  private final Color skyColor = Color.CYAN;
  private final Color myColor = new Color((int) ((Math.random())*255),((int)(Math.random())*255),((int)(Math.random())*255));
  public Rainbow()
  {
    setBackground(skyColor);
    //setBackground(myColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

	int xCenter = width / 2;
	int yCenter = height * 3 / 4;
	int largeRadius = width / 4;
	int sortOfLargeRadius = largeRadius - largeRadius/6;
	int mediumRadius = largeRadius - 2 * largeRadius/6;
	int sortOfMediumRadius = largeRadius/2;
	int smallerThanSortOfMediumRadiusRadius = largeRadius - mediumRadius;
	int smallRadius = largeRadius - sortOfLargeRadius;
	int smallerThanSmallRadiusRadius = largeRadius/12;
	
	g.setColor(Color.RED);
	g.fillArc(xCenter - largeRadius, yCenter - largeRadius, largeRadius * 2, largeRadius * 2, 0, 180);
	g.setColor(Color.YELLOW);
	g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, mediumRadius * 2, mediumRadius * 2, 0, 180);
	g.setColor(Color.BLUE);
	g.fillArc(xCenter - smallerThanSortOfMediumRadiusRadius, yCenter - smallerThanSortOfMediumRadiusRadius, smallerThanSortOfMediumRadiusRadius * 2, smallerThanSortOfMediumRadiusRadius * 2, 0, 180);
	g.setColor(Color.CYAN);
	g.fillArc(xCenter - smallerThanSmallRadiusRadius, yCenter - smallerThanSmallRadiusRadius, smallerThanSmallRadiusRadius * 2, smallerThanSmallRadiusRadius * 2, 0, 180);
  
	
//	g.setColor(Color.RED);
//	g.fillArc(xCenter - largeRadius, yCenter - largeRadius, largeRadius * 2, largeRadius * 2, 0, 180);
//	g.setColor(Color.ORANGE);
//	g.fillArc(xCenter - sortOfLargeRadius, yCenter - sortOfLargeRadius, sortOfLargeRadius * 2, sortOfLargeRadius * 2, 0, 180);
//	g.setColor(Color.YELLOW);
//	g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, mediumRadius * 2, mediumRadius * 2, 0, 180);
//	g.setColor(Color.GREEN);
//	g.fillArc(xCenter - sortOfMediumRadius, yCenter - sortOfMediumRadius, sortOfMediumRadius * 2, sortOfMediumRadius * 2, 0, 180);
//	g.setColor(Color.BLUE);
//	g.fillArc(xCenter - smallerThanSortOfMediumRadiusRadius, yCenter - smallerThanSortOfMediumRadiusRadius, smallerThanSortOfMediumRadiusRadius * 2, smallerThanSortOfMediumRadiusRadius * 2, 0, 180);
//	g.setColor(Color.MAGENTA);
//	g.fillArc(xCenter - smallRadius, yCenter - smallRadius, smallRadius * 2, smallRadius * 2, 0, 180);
//	g.setColor(Color.CYAN);
//	g.fillArc(xCenter - smallerThanSmallRadiusRadius, yCenter - smallerThanSmallRadiusRadius, smallerThanSmallRadiusRadius * 2, smallerThanSmallRadiusRadius * 2, 0, 180);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
