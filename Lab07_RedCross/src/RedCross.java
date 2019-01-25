import java.awt.*;
import javax.swing.*;

/**
 *  This program displays a red cross on a white
 *  background.
 */

public class RedCross extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillRect(xCenter-5, yCenter, 10, 50); //g.fillRect creates a certain rectangle with certain coordinates
    g.fillRect(xCenter-5, yCenter, 50, 10);
    g.fillRect(xCenter-5, yCenter - 40, 10, 40);
    g.fillRect(xCenter - 45, yCenter, 40, 10);
//    g.setClip(Color.TRANSLUCENT, yCenter, yCenter, yCenter);
//    g.fillOval(xCenter, yCenter, 10, 50);
//    g.fillOval(xCenter, yCenter, 50, 10);
//    g.fillOval(xCenter, yCenter - 40, 10, 40);
//    g.fillOval(xCenter - 40, yCenter, 40, 10);
  }

  public static void main(String[] args)// main method executes the code inside
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}


