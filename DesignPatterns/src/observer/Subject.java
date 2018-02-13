package observer;


public interface Subject {
	
	//methods to register and unregister observers
	 //public void register(Observer obj);
	 //public void unregister(Observer obj);
	
	void register(observer.Observer obj);
	void unregister(observer.Observer obj);

	 //method to notify observers of change
	 public void notifyObservers();

	 //method to get updates from subject
	 //public Object getUpdate(Observer obj);
	public Object getUpdate(observer.Observer obj);
	

	}


