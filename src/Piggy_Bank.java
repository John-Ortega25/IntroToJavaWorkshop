import javax.swing.JOptionPane;

public class Piggy_Bank {
	public static void main(String[] args) {
		String numQuartersString= JOptionPane.showInputDialog(null, "How many quarters do you have?");
		String numDimesString= JOptionPane.showInputDialog("Dimes?");
		String numNickelsString= JOptionPane.showInputDialog("Nickels?");
		String numPenniesString= JOptionPane.showInputDialog("Pennies?");
		int numQuarters= Integer.parseInt(numQuartersString);
		int valueQuarters= numQuarters* 25;
		int numDimes= Integer.parseInt(numDimesString);
	int valueDimes= numDimes* 10;
	int numNickels= Integer.parseInt(numNickelsString);
	int valueNickels= numNickels* 5;
	int numPennies= Integer.parseInt(numPenniesString);
	int totalValue= valueQuarters+ valueDimes+ valueNickels+ numPennies;
	int totalDollars= totalValue/100;
	int totalCents= totalValue%100;
	JOptionPane.showMessageDialog(null, "You have "+ totalDollars+ " dollars and "+ totalCents+ " cents");
	
	}
}
