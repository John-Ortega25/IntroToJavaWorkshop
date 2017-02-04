import org.jointheleague.graphical.robot.Robot;

public class robotFreestyle {
public static void main(String[] args) {
	Robot john = new Robot();
	john.setSpeed(10);
	john.penDown();
	john.sparkle();
	for(int i= 0; i<6; i=i+1){
	john.move(200);
	john.turn(60);
	
	}
}
}
