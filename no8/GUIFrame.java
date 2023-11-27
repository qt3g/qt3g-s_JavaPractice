package no8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUIFrame extends JFrame implements ActionListener{
	JButton btn1,btn2;
	public GUIFrame() {
		JPanel panel = new JPanel();
		btn1 = new JButton("PLAY");
		btn2 = new JButton("STOP");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		panel.add(btn1);
		panel.add(btn2);
		
		add(panel);
		setSize(500,500);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			System.out.println("PLAYが押された");
			} else if(e.getSource() == btn2) {
			System.out.println("STOPが押された");
			}
	}
}
