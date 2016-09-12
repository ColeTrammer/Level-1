import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaGUI implements ActionListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button1;
	JButton button2;
	
	JavaGUI() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(800, 600);
		
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
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("A");
		
	}
	
	public static void main(String[] args) {
		JavaGUI javaGUI = new JavaGUI();
	}
	
}
