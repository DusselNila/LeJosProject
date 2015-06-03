import lejos.nxt.*;

import EventImpl.*;
import Interfaces.*;

public class SensorListener extends Observable implements ISensorListener
{
	private TouchSensor _sensor;
	
	public SensorListener(TouchSensor watchedSensor)
	{
		_sensor = watchedSensor;
	}
	
	@Override
	public boolean getSensorState()
	{
		return _sensor.isPressed();
	}
}
