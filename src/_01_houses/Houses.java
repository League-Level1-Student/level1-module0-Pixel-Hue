package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		
		}
	public void run(String height) {
		Robot a = new Robot("mini");
		a.moveTo(20, 580);
		a.penDown();
		a.setSpeed(100);
		for (int i = 0; i < 9; i++) {
			
		
		a.setPenColor(5, 10, 100);
		if (height.equalsIgnoreCase("small") ) {
		a.move(60);
		}
		if (height.equalsIgnoreCase("medium") ) {
			a.move(120);
			}
		if (height.equalsIgnoreCase("large") ) {
			a.move(240);
			}
		a.turn(90);
		a.move(20);
		a.turn(90);
		if (height.equalsIgnoreCase("small") ) {
			a.move(60);
			}
			if (height.equalsIgnoreCase("medium") ) {
				a.move(120);
				}
			if (height.equalsIgnoreCase("large") ) {
				a.move(240);
				}
		a.turn(-90);
		a.setPenColor(0, 255, 5);
		a.move(15);
		a.turn(-90);
	}
		
}
}
