package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot a = new Robot("mini");
	Random b = new Random();

	public void run() {
		a.moveTo(20, 580);
		a.penDown();
		a.setSpeed(100);
		a.setWindowColor(Color.black);
		for (int i = 0; i < 9; i++) {
			int c = b.nextInt(3);

			if (c == 0) {
				drawHouse("small");
			} else if (c == 1) {
				drawHouse("medium");
			} else if (c == 2) {
				drawHouse("large");
			}

		}
	}

	public void drawHouse(String height) {
		int d = b.nextInt(3);

		if (height.equals("small")) {

			if (d == 0) {
				drawHouse(60, 0);
			} else if (d == 1) {
				drawHouse(60, 1);
			} else if (d == 2) {
				drawHouse(60, 2);
			}

		} else if (height.equals("medium")) {

			if (d == 0) {
				drawHouse(120, 0);
			} else if (d == 1) {
				drawHouse(120, 1);
			} else if (d == 2) {
				drawHouse(120, 2);
			}

		} else if (height.equals("large")) {

			if (d == 0) {
				drawHouse(240, 0);
			} else if (d == 1) {
				drawHouse(240, 1);
			} else if (d == 2) {
				drawHouse(240, 2);

			}

		}
	}

	public void drawPointyRoof() {
		a.turn(45);
		a.move(10);
		a.turn(90);
		a.move(10);
		a.turn(45);
	}

	public void drawFlatRoof() {
		a.turn(90);
		a.move(20);
		a.turn(90);
	}

	public void drawHouse(int height, int color) {
		if (color == 0) {
			a.setPenColor(255, 0, 0);
		} else if (color == 1) {
			a.setPenColor(0, 125, 0);
		} else if (color == 2) {
			a.setPenColor(0, 0, 255);
		}
		a.move(height);
		if (height == 240) {
			drawFlatRoof();
		}
		else {
			drawPointyRoof();
		}
		a.move(height);
		a.turn(-90);
		a.setPenColor(0, 255, 5);
		a.move(15);
		a.turn(-90);
	}
}
