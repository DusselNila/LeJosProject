import Interfaces.INotification;
import Interfaces.IObserver;
import lejos.nxt.*;


public class engineController implements IObserver {
	SensorListener listenerVorne;
	SensorListener listenerLinks;
	boolean kante = false; 
	
	public void execute() {
		TouchSensor sensorVorne = new TouchSensor(SensorPort.S1);
		TouchSensor sensorLinks = new TouchSensor(SensorPort.S2);
		listenerVorne = new SensorListener(sensorVorne);
		listenerLinks = new SensorListener(sensorLinks);
		listenerVorne.addObserver(this);
		listenerLinks.addObserver(this);
	}
	
	@Override
	public void update(INotification msg) {
		//Kante anfahren
		if(kante == false){
			if(listenerVorne.getSensorState() == false) {
				//Drehen
			} 
			else if(listenerVorne.getSensorState() == true) {
				if(msg.getSender() == listenerVorne){
				//Drehen stoppen und losfahren
				kante = true;
				}
			}
		}
		
	}

}
