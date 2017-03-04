import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Robot_Design {
	static void drawSquare(Robot bot, int size, Color color, int loc, int width) {
		for (int i = 0; i < 4; i = i + 1) {
			bot.setPenWidth(width);
			bot.setPenColor(color);
			bot.move(size);
			bot.turn(90);
		}
	}
	static void moveToNewSquare(Robot bot, int turn, int move, int turn2){
		bot.turn(turn);
		bot.penUp();
		bot.move(move);
		bot.turn(turn2);
		bot.penDown();	
		
	}
	
public static void main(String[] args) {
		Robot bot = new Robot();
		bot.penDown();
		bot.setSpeed(10);
		drawSquare(bot, 100, Color.GREEN, 0, 1);
		moveToNewSquare(bot,90,300,-90);
		drawSquare(bot, 150, Color.magenta, 0, 5);
		moveToNewSquare(bot, 90, 300, -90);
		drawSquare(bot, 200, Color.ORANGE, 0, 10);
	}
}
