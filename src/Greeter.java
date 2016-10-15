import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hi");
	String answer= JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,answer);
	JOptionPane.showMessageDialog(null, "Nice to meet you!");

}
}
