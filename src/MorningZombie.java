import javax.swing.JOptionPane;

public class MorningZombie {
	static void dayPrint(String dayOfWeek) {
		JOptionPane.showMessageDialog(null, "It's" + dayOfWeek + " wake Up!");
		JOptionPane.showMessageDialog(null, "Put on some clothes");
		JOptionPane.showMessageDialog(null, "Eat the whole refrigerator!");
	}

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("What day is it?");
		if (answer.equalsIgnoreCase("Monday") || answer.equalsIgnoreCase("Tuesday")
				|| answer.equalsIgnoreCase("Wednesday") || answer.equalsIgnoreCase("Thursday")
				|| answer.equalsIgnoreCase("Friday")) {
			dayPrint(answer);
		}
	}
}
