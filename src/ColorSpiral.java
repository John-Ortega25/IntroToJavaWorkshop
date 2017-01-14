import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ColorSpiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot spiral= new Robot();
		// 5. Set your robot's pen to the down position
		spiral.penDown();
		// 3. Set the robot to go at max speed (10)
		spiral.setSpeed(10);
		// 4. Repeat the code below 75 times (you’ll need to move the mustache!)
		String sides=JOptionPane.showInputDialog("Put a number of sides that you would like");
		int numSide= Integer.parseInt(sides);
		String speed= JOptionPane.showInputDialog("What speed would you like?");
		int numSpeed= Integer.parseInt(speed);
		for(int num=0; num<=75;num=num+1){
			// 7. Change the pen color to random
			spiral.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			 spiral.move(5*num);                        
			// 2. Turn the robot 1/3 of 360 degrees to the right
		 spiral.turn(360/numSide);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
		spiral.setPenWidth(num);
		}
	}
}


