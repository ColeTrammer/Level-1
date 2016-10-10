import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle implements ActionListener {

	JFrame frame;
	JPanel panel;
	JLabel riddle;
	JButton submit;
	JButton hint;
	JTextField ans;
	
	public Riddle() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(700, 200));
		frame.add(panel);
		
		riddle = new JLabel("I don't have eyes, but once I did see. Once I had thoughts, but now I'm white and empty. What am I?");
		panel.add(riddle);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		panel.add(submit);
		
		ans = new JTextField("Type your answer here!");
		panel.add(ans);
		
		hint = new JButton("Hint");
		hint.addActionListener(this);
		panel.add(hint);
		
		frame.pack();
	}
	
	public static void main(String[] args) {
		new Riddle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = "";
		if (e.getSource().equals(submit)) {
			if (ans.getText().equalsIgnoreCase("Skull")) {
				text = "You got it right!";
			} else {
				text = "You got it wrong! Try again!";
			}
		} else if (e.getSource().equals(hint)) {
			text = "I used to be alive.";
		}
		JOptionPane.showMessageDialog(frame, text);
	}
}
