import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinConverter implements ActionListener {

	JFrame frame;
	JPanel panel;
	JTextField in;
	JButton submit;
	JLabel label;

	public PigLatinConverter() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(800, 600));
		frame.add(panel);

		in = new JTextField(10);
		panel.add(in);

		submit = new JButton("translate");
		submit.addActionListener(this);
		panel.add(submit);

		label = new JLabel("");
		panel.add(label);

		frame.pack();
	}

	public static void main(String args[]) {
		new PigLatinConverter();
	}

	private boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y';
	}

	private int firstVowelIndex(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				return i;
			}
		}
		return 0;
	}

	private String translate(String s) {
		int fv = firstVowelIndex(s);
		if (fv == 0) {
			return s + "way";
		}
		/*
		System.out.println(fv);
		System.out.println(s.substring(fv));
		System.out.println(s.substring(fv) + s.substring(0, fv) + "ay");
		*/
		String subs = s.substring(fv);
		return subs + s.substring(0, fv) + "ay";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String result = "";
		String[] splitP = in.getText().split(".");
		String[][] splitS;
		for (int i = 0; i < splitP.length; i++) {
			splitS[i] = splitP[i].split(" "); 
		}
		/*
		String[] splitS =in.getText().split(" ");
		for (int i = 0; i < splitS.length; i++) {
			result += translate(splitS[i].toLowerCase()) + " ";
		}
		*/
		label.setText(result);
	}

}