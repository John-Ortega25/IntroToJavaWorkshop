import javax.swing.JOptionPane;

public class SecretMessageBox {
	
	public static void main(String[] args) {
		// Ask the user for a username and password
		String username = JOptionPane.showInputDialog("What is your username");
		String password = JOptionPane.showInputDialog("What is your password");
		// Check if the answer of the input dialog matches the password
		// If the users answer matches, show them the secret message
		if (username.equals("John") && password.equals("Password")) {
			JOptionPane.showMessageDialog(null, "No secret message");
		}
		// If the users answer doesn't match, show a pop-up message saying "INTRUDER ALERT"
		else {
			JOptionPane.showMessageDialog(null, "INTRUDER ALERT");
		}
	}
}
