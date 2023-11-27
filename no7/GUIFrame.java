package no7;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIFrame extends JFrame{
	JPanel panel;
	JButton btn1;
	JButton btn2;
	public GUIFrame() {
		panel = new JPanel();
		btn1 = new JButton("再生");
		panel.add(btn1);
		btn2 = new JButton("停止");
		panel.add(btn2);
		add(panel);
		setSize(300,100);
		setVisible(true);
	}
}
