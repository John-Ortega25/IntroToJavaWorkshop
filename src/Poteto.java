import javax.swing.JOptionPane;

public class Poteto {
	public static void main(String[] args) {
		int num = 0;
		String answer = JOptionPane.showInputDialog("do you want poteto?");
		if(answer.equals ("yes")){
		while (num < 7) {

			num = num + 1;
			if (num == 4) {
				System.out.println("4");
			} else {
				System.out.println(num + answer);
			}
		}
		System.out.println("more");
	}
}
}