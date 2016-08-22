package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot John=new Robot();
		John.penDown();
		John.setSpeed(10);
		int sides=Integer.parseInt(JOptionPane.showInputDialog("Hello"));
		for (int i = 0; i < sides; i++) {
		John.move(100);
		John.turn(360/sides);
		}
		
	}
}
