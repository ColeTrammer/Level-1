import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaGUI implements ActionListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button1;
	JButton button2;
	JTextField textfield;
	
	JavaGUI() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		panel = new JPanel();
		frame.add(panel);
		
		label = new JLabel("Hello");
		panel.add(label);
		
		button1 = new JButton("Click");
		panel.add(button1);
		button1.addActionListener(this);
	
		button2 = new JButton("Click");
		panel.add(button2);
		button2.addActionListener(this);
		
		textfield = new JTextField(10);
		panel.add(textfield);
		
		frame.setSize(800, 600);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(textfield.getText());
	}
	
	public static void main(String[] args) {
		JavaGUI javaGUI = new JavaGUI();
	}
	
}
