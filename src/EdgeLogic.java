import Interfaces.INotification;
import Interfaces.IObserver;
import lejos.nxt.*;

public class EdgeLogic implements IObserver{
	SensorListener listenerFront;
	SensorListener listenerLeft;
	
	public void start() {
		TouchSensor sensorFront = new TouchSensor(SensorPort.S1);
		TouchSensor sensorLeft = new TouchSensor(SensorPort.S2);
		listenerFront = new SensorListener(sensorFront);
		listenerLeft = new SensorListener(sensorLeft);
		listenerFront.addObserver(this);
		listenerLeft.addObserver(this);
	}
	
	@Override
	public void update(INotification msg) {
		if(msg.getSender() instanceof SensorListener){
			if(listenerFront.getSensorState() == false){
				//turn right
			}
			else if(listenerLeft.getSensorState() == false){
				//drive
			}
			else if(listenerLeft.getSensorState() == true){
				if(msg.getSender() == listenerLeft){
					//turn left
				}
				else if(msg.getSender() == listenerFront){
					//drive
				}
			}
			
		}//else if(msg.getObject() instanceof KeyListener)
		
	}
}
