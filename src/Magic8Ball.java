import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		// Create and save a random variable
		Random generator = new Random();
		// Create a for loop to ask the question a few times
		for (int i = 0; i <= 2; i = i + 1) {
			// save your random number
			int num = generator.nextInt(3) + 1;
			// Print out the random number in the console
			System.out.println(num);
			// ask the user a question
			JOptionPane.showInputDialog("Ask a question");
			// Create if/else if/else statements so that your three phrases will pop up corresponding with your random number
			if (num == 1) {
				JOptionPane.showMessageDialog(null, "It depends");
			} else if (num == 2) {
				JOptionPane.showMessageDialog(null, "Maybe");
			} else {
				JOptionPane.showMessageDialog(null, "No");
			}
		}
	}
}
