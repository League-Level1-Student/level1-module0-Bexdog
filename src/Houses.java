

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot();
	static int size;
	static Color  color;
public static void main(String[] args) {
	String Bob = "";
	
	int small = 60;
	int medium = 120;
	int large = 250;
	bob.setSpeed(255);
	bob.setX(50);
	bob.setY(500);
	bob.penDown();
	for(int i = 0;i<999;i++) {
		Bob = JOptionPane.showInputDialog("pick a size; small, medium, or large?");
		if(Bob.equals("small")) {
			size = small;
			color = Color.CYAN;
		}
		else if(Bob.equals("medium")) {
			size = medium;
			color = Color.GREEN;
		}
		else {
		size = large;
		color = Color.MAGENTA;
		}
		drawHouse();
	
	}
}
static void drawHouse() {
	Robot.setWindowColor(Color.BLACK);
	bob.setPenColor(color);
	bob.move(size);
	if(size ==250) {
	drawFlatRoof();
	}
	else {
		drawPointyRoof();
	}
	bob.move(size);
	bob.turn(-90);
	bob.move(10);
	bob.turn(-90);
}
static void drawPointyRoof() {
	bob.turn(45);
	bob.move(10);
	bob.turn(90);
	bob.move(10);
	bob.turn(45);
}
static void drawFlatRoof() {
	bob.turn(90);
	bob.move(15);
	bob.turn(90);
}
}
