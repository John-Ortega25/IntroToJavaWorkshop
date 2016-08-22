package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	Robot John= new Robot();
	
	// 2. Create a new Robot
	

	void go()  {
		// 4. Make the robot move as fast as possible
		John.setSpeed(10);
		// 5. Set the pen width to 5
		John.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		John.setRandomPenColor();
		John.turn(90);
			// 7. Set the pen color to random
	John.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		drawSquare();
		John.setSpeed(10);
		John.setPenWidth(5);
		John.setRandomPenColor();
		John.turn(90);
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
