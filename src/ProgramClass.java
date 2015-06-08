import lejos.nxt.*;


public class ProgramClass {

	public static void main(String[] args) throws InterruptedException{
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		
		Motor.A.forward();
		Motor.B.forward();
		
		Thread.sleep(2000);
		
		Motor.A.stop();
		Motor.B.stop();
		
		engineController engine = new engineController();
		engine.execute();
	}

}
