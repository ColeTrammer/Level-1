
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String catImageURL = "https://d1wn0q81ehzw6k.cloudfront.net/additional/thul/media/4e34feee0acdc38a?w=400&h=400";
		// 2. create a variable of type "Component" that will hold your image
		Component catImage;
		// 3. use the "createImage()" method below to initialize your Component
		catImage = createImage(catImageURL);
		// 4. add the image to the quiz window
		quizWindow.add(catImage);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String res = JOptionPane.showInputDialog("What is this?");
		// 7. print "CORRECT" if the user gave the right answer
		JLabel ans;
		if (res.equalsIgnoreCase("cat")) {
			ans = new JLabel("CORRECT");
			quizWindow.add(ans);
		}
		else {
			ans = new JLabel("INCORRECT");
			quizWindow.add(ans);
		}
		quizWindow.remove(catImage);
		quizWindow.pack();
		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)\
		// 10. find another image and create it (might take more than one line
		// of code)
		String dogImageURL = "https://www.royalcanin.com/~/media/Royal-Canin/Product-Categories/dog-medium-landing-hero.ashx";
		Component dogImage = createImage(dogImageURL);
		// 11. add the second image to the quiz window
		quizWindow.remove(ans);
		quizWindow.add(dogImage);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		res = JOptionPane.showInputDialog("What is this?");
		if (res.equalsIgnoreCase("dog")) {
			ans = new JLabel("CORRECT");
			quizWindow.add(ans);
		}
		else {
			ans = new JLabel("INCORRECT");
			quizWindow.add(ans);
		}
		quizWindow.remove(dogImage);
		quizWindow.pack();
		
		String birdImageURL = "https://upload.wikimedia.org/wikipedia/commons/3/32/House_sparrow04.jpg";
		Component birdImage = createImage(birdImageURL);
		// 11. add the second image to the quiz window
		quizWindow.remove(ans);
		quizWindow.add(birdImage);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		
		res = JOptionPane.showInputDialog("What is this?");
		if (res.equalsIgnoreCase("bird")) {
			ans = new JLabel("CORRECT");
			quizWindow.add(ans);
		}
		else {
			ans = new JLabel("INCORRECT");
			quizWindow.add(ans);
		}
		quizWindow.remove(birdImage);
		quizWindow.pack();
		
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
