import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SlotMachine implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton spinButton;
	JLabel slot1, slot2, slot3;
	JTextField bet;
	
	JLabel totalDisplay;
	double total = 1000.0;
	
	Random ran;
	
	public SlotMachine() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(800, 600));
		frame.add(panel);
		
		spinButton = new JButton("SPIN");
		panel.add(spinButton);
		spinButton.addActionListener(this);
		
		slot1 = new JLabel("0");
		slot2 = new JLabel("0");
		slot3 = new JLabel("0");
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		
		bet = new JTextField(5);
		panel.add(bet);
		bet.setToolTipText("bet");
	
		totalDisplay = new JLabel("$" + Double.toString(total));
		panel.add(totalDisplay);
		totalDisplay.setToolTipText("You're total cash.");
		
		frame.pack();
		
		ran = new Random();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String betText = bet.getText();
		
		Double betVal;
		if (!betText.isEmpty())
			try {
				betVal = Double.parseDouble(betText);
				if (betVal > total || betVal <= 0.0)
					return;
			}
			catch (NumberFormatException asdf) {
				return;
		} else {
			return;
		}
		
		if (e.getSource() == spinButton) {
			int slot1val = ran.nextInt(3);
			int slot2val = ran.nextInt(3);
			int slot3val = ran.nextInt(3);
			
			slot1.setText(Integer.toString(slot1val));
			slot2.setText(Integer.toString(slot2val));
			slot3.setText(Integer.toString(slot3val));
			
			if (slot1val == slot2val && slot2val == slot3val) {
				total += (betVal * 2);
			} 
			else if (slot1val == slot2val || slot2val == slot3val || slot1val == slot3val)  {
				
			}
			else {
				total -= betVal;
			}
			
		}
		
		if (total <= 0.0) {
			total = 0.0;
			JOptionPane.showMessageDialog(frame, "You lose!");
		}
		
		//total = Math.round(total * 100)/100;
		
		frame.pack();
		updateTotal();
	}
	
	private void updateTotal() {
		totalDisplay.setText("$" + Double.toString(total));
	}
	
	public static void main(String[] args) {
		new SlotMachine();
	}

}
