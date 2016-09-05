import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "Obama.jpg";
	String secondImage = "Leo.jpg";
	String thirdImage = "TaylorSwift.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(200, 200);
		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer
		String ans = JOptionPane.showInputDialog(window, "Who is this person?");
		// If they got the answer right:
		if (ans.equalsIgnoreCase("Obama")) {
			JOptionPane.showMessageDialog(window, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(window, "Incorrect");
		}
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		showNextImage();
		window.setSize(200, 200);
		
		// Ask the user who this person is and store their answer
		ans = JOptionPane.showInputDialog(window, "Who is this person?");
		// If they got the answer right:
		if (ans.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(window, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(window, "Incorrect");
		}
		
		showNextImage();
		window.setSize(200, 200);
		
		// Ask the user who this person is and store their answer
		ans = JOptionPane.showInputDialog(window, "Who is this person?");
		// If they got the answer right:
		if (ans.equalsIgnoreCase("Taylor Swift")) {
			JOptionPane.showMessageDialog(window, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(window, "Incorrect");
		}
		
		// Show the score
		JOptionPane.showMessageDialog(window, "You got a score of " + score + ".");
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
		System.exit(0);
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

