
import java.awt.*;
import javax.swing.*;

/* Author: Bryan H.
 * Date: 10/31/18
 * Description: Paints a house
 */

public class BadStyle extends JPanel { 
	
    public void paintComponent(Graphics GRAPHICS)  {
        
        super.paintComponent(GRAPHICS);
        
        GRAPHICS.setColor(Color.GREEN);
        GRAPHICS.fillRect(120, 20, 17, 40); 
        GRAPHICS.setColor(Color.RED);
        GRAPHICS.fillRect(30, 40, 130, 45);
        GRAPHICS.setColor(Color.BLUE);

        Polygon thisisapolygon = new Polygon();
        
        thisisapolygon.addPoint(30, 40);
        thisisapolygon.addPoint(160, 40);
        thisisapolygon.addPoint(95, 20);
        
        GRAPHICS.fillPolygon(thisisapolygon);  
    }

public static void main(String[] args) { 
        JFrame screen = new JFrame("Graphics Demo");
        screen.setBounds(300, 300, 200, 150);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BadStyle panel = new BadStyle();                                         
        panel.setBackground(Color.WHITE);
        
        Container c = screen.getContentPane();
        c.add(panel);
        
        screen.setVisible(true);
    }
}

