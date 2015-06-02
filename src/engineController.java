import lejos.nxt.*;


public class engineController {

	public static void main(String[] args) throws InterruptedException {
		
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		
		Motor.A.forward();
		Motor.B.forward();
		
		Thread.sleep(2000);
		
		Motor.A.stop();
		Motor.B.stop();

	}

}
