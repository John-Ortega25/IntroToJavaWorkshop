import javax.swing.JOptionPane;

public class Annoying_Reminder {
	public static void main(String[] args) {

		String numTimes = JOptionPane.showInputDialog("How annoying am I?");
		int num = Integer.parseInt(numTimes);
		// JOptionPane.showMessageDialog(null, num);
		for (int numtimes = 0; numtimes < num; numtimes = numtimes + 1) {
			JOptionPane.showMessageDialog(null, "Get up Early");

		}
	}
}