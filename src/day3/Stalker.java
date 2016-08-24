package day3;

import javax.swing.JOptionPane;

public class Stalker {
public static void main(String[] args) {
	String Password= JOptionPane.showInputDialog("What is your password");
	String Address= JOptionPane.showInputDialog("Where do you live");
	String Pin= JOptionPane.showInputDialog("What is your pin");
	JOptionPane.showMessageDialog(null, "I know your is" + Password);
	JOptionPane.showMessageDialog(null, "I know that your address is " + Address);
	JOptionPane.showMessageDialog(null, "I also that your pin is " + Pin);
}
}
