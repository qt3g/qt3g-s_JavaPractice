package no9;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.fillOval(20, 50, 300, 300);
		g.fillOval(340, 50, 300, 300);
		g.fillOval(660, 50, 300, 300);
	}
}
