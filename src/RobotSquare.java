import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(10);
		for (int num = 0; num < 4; num = num + 1) {
			rob.move(200);
			rob.turn(90);
		}
		rob.penUp();
		rob.move(250);
		rob.penDown();
		rob.turn(90);
		rob.setRandomPenColor();
		for (int num2 = 0; num2 < 6; num2 = num2 + 1) {
		rob.move(200);
		rob.turn(60);
		
		}
	}
}
