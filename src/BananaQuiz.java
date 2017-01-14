
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String Question = JOptionPane.showInputDialog("Do you like bananas?");
		// 2. if they say no,
		if (Question.equals("no")) {
			JOptionPane.showMessageDialog(null, "Then you are crazy!");
		}
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		else if (Question.equals("yes")) {
			String Answer = JOptionPane.showInputDialog("What is your hobby");
			JOptionPane.showMessageDialog(null, Answer + " is much better with bananas");
		}

		else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}
		String Question2 = JOptionPane.showInputDialog("What other fruits do you like?");
		if (Question2.equals("apple")) {
			JOptionPane.showMessageDialog(null, "I like that too");
		} else {

		}
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}
