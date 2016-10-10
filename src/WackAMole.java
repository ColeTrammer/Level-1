import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WackAMole implements ActionListener {

	JFrame frame;
	JPanel panel;
	
	Random r;
	JButton moleButton;
	
	public WackAMole() {
		r = new Random();
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		setup();
	}
	
	void setup() {
		frame.remove(panel);
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(250, 300));
		frame.add(panel);
		updateDisplay();
	}
	
	void drawButtons(int n) {
		moleButton = new JButton("mole!");
		moleButton.addActionListener(this);
		for (int i = 0; i < 24; i++) {
			if (i == n) {
				panel.add(moleButton);
			}
			else {
				JButton tmp = new JButton();
				tmp.addActionListener(this);
				panel.add(tmp);
			}
		}
	}
	
	void updateDisplay() {
		drawButtons(r.nextInt(24));
		frame.pack();
	}
	
	public static void main(String[] args) {
		new WackAMole();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(moleButton)) {
			setup();
		} else {
			speak("wrong!");
		}
	}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
