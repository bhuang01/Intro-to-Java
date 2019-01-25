/*
 * Author: Bryan H.
 * Date: 11/30/18
 * Description: Draws a sun rotating the screen
 * Version: 2.0
 * Version Notes: Draws a moon rotating the screen
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingDisk extends JPanel
  implements ActionListener
  {
  private int time;

  public MovingDisk()
  {
    time = 0;
    Timer clock = new Timer(20, this); 
    clock.start();
  }

  //Sets up graphical component of the program
  public void paintComponent(Graphics g)
  {
    int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
    int y = 130 - (int)(75 * Math.sin(0.005 * Math.PI * time));
    int r = 20;

    int x2 = 150 - (int)(-100 * Math.cos(0.005 * Math.PI * time));
    int y2 = 130 - (int)(-75 * Math.sin(0.005 * Math.PI * time));
    
    Color sky;
    if (y > 130) sky = Color.BLUE;
    else sky = Color.CYAN;
    setBackground(sky);
    super.paintComponent(g);
    
    //Draws the sun with color orange
    g.setColor(Color.ORANGE);
    g.fillOval(x - r, y - r, 2*r, 2*r); 
    
    //Draw the moon with color light gray
    g.setColor(Color.lightGray);
    g.fillOval(x2- r, y2 - r, r+10, r+10);
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Moving Disk");
    w.setSize(300, 150);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new MovingDisk());
    w.setResizable(false);
    w.setVisible(true);
  }
}