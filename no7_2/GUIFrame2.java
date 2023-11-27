package no7_2;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUIFrame2 extends JFrame{
	JPanel panel;
	JButton btn1;
	JButton btn2;
	public GUIFrame2() {
		ImageIcon icon1 = new ImageIcon("https://github.com/qt3g/qt3g-s_JavaPractice/blob/main/no7_2/check.png");
		ImageIcon icon2 = new ImageIcon("https://github.com/qt3g/qt3g-s_JavaPractice/blob/main/no7_2/batsu.png");
		
		JButton button1 = new JButton(icon1);

	    JButton button2 = new JButton(icon2);

		
		panel = new JPanel();
		btn1 = new JButton(icon1);
		panel.add(btn1);
		btn2 = new JButton(icon2);
		panel.add(btn2);
		add(panel);
		setSize(500,500);
		setVisible(true);
		
	}
}
