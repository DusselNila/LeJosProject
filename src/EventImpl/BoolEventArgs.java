package EventImpl;

public class BoolEventArgs
{
	private boolean _flag;
	
	public BoolEventArgs(Boolean flag) 
	{
		_flag = flag;
	}
	
	public boolean getArgs()
	{
		return _flag;
	}
}
