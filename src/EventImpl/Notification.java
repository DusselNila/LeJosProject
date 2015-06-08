package EventImpl;

import Interfaces.*;

public class Notification implements INotification
{
	private final Object sender;
	private final Object args;
	
	public Notification(Object sender, Object args)
	{
		this.sender = sender;
		this.args = args;
	}
	
	@Override
	public Object getSender()
	{
		return sender;
	}
	@Override
	public Object getArgs()
	{
		return args;
	}
	
}
