import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot bot = new Robot();
		bot.penDown();
		bot.setSpeed(10);
		// 3. ask the user what color they would like the Robot to draw
		String answer = JOptionPane.showInputDialog("What color would you like the robot to draw");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (answer.equalsIgnoreCase("blue")) {
			bot.setPenColor(0, 0, 255);
		} else if (answer.equalsIgnoreCase("red")) {
			bot.setPenColor(255, 0, 0);
		} else if (answer.equalsIgnoreCase("green")) {
			bot.setPenColor(0, 255, 0);
		}
		// 2. set the pen width to 10
		bot.setPenWidth(10);
		// 1. make the Robot draw a shape
		for (int i = 0; i <= 4; i = i + 1) {
			bot.move(100);
			bot.turn(90);
		}
	}

}
