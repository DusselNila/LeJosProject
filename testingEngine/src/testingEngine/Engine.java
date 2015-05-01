package testingEngine;
import lejos.nxt.*;


class Engine {

	public static void main(String[] args) {
		Motor.A.setSpeed(360);
		Motor.A.rotate(360);
		Motor.A.rotate(-360);
		
		Sound.beep();
		
		System.out.println("Hello World\n Press any button exit");
		Button.waitForAnyPress();
		
	}

}
