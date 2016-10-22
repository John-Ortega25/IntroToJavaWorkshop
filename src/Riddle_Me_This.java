import javax.swing.JOptionPane;

public class Riddle_Me_This {
public static void main(String[] args) {
	String input= JOptionPane.showInputDialog(null, "Whats your name");
	String name= "John";
	int numRight= 0;
	
	if (name.equals(input)) {
		
		numRight=numRight+1;
	 	
	}
	JOptionPane.showMessageDialog(null, "you got " +numRight+ " right");	
	String answer=JOptionPane.showInputDialog("who are you");
	
}
}