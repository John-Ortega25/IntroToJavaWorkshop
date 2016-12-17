import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		Random generator = new Random();

		for (int number = 1; number < 6; number = number + 1) {
			int randomnum = generator.nextInt(100);
			JOptionPane.showMessageDialog(null, randomnum);
		}
	}
}