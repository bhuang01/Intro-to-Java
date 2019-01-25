/*
 * Author: Bryan H.
 * Date: 11/30/18
 * Description: Draws a epic-lookin' house
 * Version:
 * Version Notes: 
 */

import java.awt.*;
import javax.swing.*;

public class BadStyle extends JPanel {
	public void paintComponent(Graphics GRAPHICS) {
		super.paintComponent(GRAPHICS);
		GRAPHICS.setColor(Color.black);
		GRAPHICS.fillRect(120, 20, 17, 40);
		GRAPHICS.setColor(Color.RED);

		GRAPHICS.fillRect(30, 40, 130, 45);
		GRAPHICS.setColor(Color.BLUE);

		Polygon thisisapolygon = new Polygon();

		thisisapolygon.addPoint(30, 40);

		thisisapolygon.addPoint(160, 40);

		thisisapolygon.addPoint(95, 20);

		GRAPHICS.fillPolygon(thisisapolygon);
		
//		GRAPHICS.setColor(Color.yellow);
//		GRAPHICS.fillOval(0, 0, 30, 30);
	}

	public static void main(String[] args) {
		JFrame purpleDinosaur = new JFrame("Graphics Demo");
		purpleDinosaur.setBounds(300, 300, 200, 150);
		purpleDinosaur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BadStyle panel = new BadStyle();
		panel.setBackground(Color.green);
		Container c = purpleDinosaur.getContentPane();
		c.add(panel);
		purpleDinosaur.setVisible(true);
	}
}
