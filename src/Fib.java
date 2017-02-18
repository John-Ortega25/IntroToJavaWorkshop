import javax.swing.JOptionPane;

public class Fib {
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int k = i + j;
		System.out.print(i + " ");
		System.out.print(j + " ");
		System.out.print(k + " ");
		String question = JOptionPane.showInputDialog("How many Fibonacci numbers do you want?");
		int num = Integer.parseInt(question);
		for (int count = 3; count < num; count = count + 1) {
			// Assign a new value for i
			i = j;
			// Assign a new value for j
			j = k;
			// Do calculations to get k
			k = i + j;

			System.out.print(k+ " ");
		}
	}
}
