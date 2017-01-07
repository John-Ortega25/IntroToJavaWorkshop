import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		String John = "October 16";
		String David = "October 27";
		String Zaira = "April 16";
		String Question = JOptionPane.showInputDialog("Whose birthday do you want to know?");
		if (Question.equals("John")) {
			JOptionPane.showMessageDialog(null, John);
		}
		if (Question.equals("Zaira")) {
			JOptionPane.showMessageDialog(null, Zaira);
		}
		if (Question.equals("David")) {
			JOptionPane.showMessageDialog(null, David);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry I don't know");
		}
	}
}
