package no9;
import javax.swing.JFrame;

public class GraphicsFrame extends JFrame {
	GraphicsFrame() {
		add(new GraphicsPanel());
		setSize(1000,500);
		setVisible(true);
	}
}
