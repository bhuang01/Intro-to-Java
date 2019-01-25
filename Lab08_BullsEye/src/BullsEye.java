import java.awt.*;
import javax.swing.*;

/**
 *  This program displays a red cross on a white
 *  background.
 */

public class BullsEye extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    
    Color myColor = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    g.setColor(myColor);
    g.fillOval(60, 60, 145, 145);
//    g.fillOval(xCenter - 50, yCenter - 50, 100, 100);
//    g.setColor(Color.WHITE);
//    g.fillOval(xCenter - 32, yCenter - 32, 64, 64);
//    g.setColor(myColor);
//    g.fillOval(xCenter - 12, yCenter - 12, 24, 24); 
//    g.setColor(Color.RED);
//    g.fillRect(xCenter - 50, yCenter - 50, 100, 100);
//    g.setColor(Color.WHITE);
//    g.fillRect(xCenter - 32, yCenter - 32, 64, 64);
//    g.setColor(Color.RED);
//    g.fillRect(xCenter - 12, yCenter - 12, 24, 24); 
  }

  public static void main(String[] args)// main method executes the code inside
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(0, 0, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    BullsEye panel = new BullsEye();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

