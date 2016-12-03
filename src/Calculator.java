import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args){
		String ans1= JOptionPane.showInputDialog("Enter a number");
		String ans2= JOptionPane.showInputDialog("Enter a second number");
		
		int num1= Integer.parseInt(ans1);
		int num2= Integer.parseInt(ans2);
		int answer= multiply(num1,num2);
	JOptionPane.showMessageDialog(null, answer);;
	
	}
		static int sum(int answer1, int answer2){
		return answer1+ answer2;
		}
		static int multiply(int answer1, int answer2){
		return answer1* answer2;
		}
		static int divide(int answer1, int answer2){
		return answer1/ answer2;
		}
		static int subtract(int answer1, int answer2){
		return answer1-answer2;
		}
		
		
		}