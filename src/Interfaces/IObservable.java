package Interfaces;

public interface IObservable
{
	void addObserver(IObserver o);
	
	void deleteObserver(IObserver o);
	
	void notifyObservers(INotification msg);
}
