
public interface Broker  extends Node{
	//registeredUsers List<Consumer>;
	//rigestereedPublishers List<Publisher>;
	
	public void calculateKeys();
	
	public Publisher acceptConnection(Publisher p);
	
	public Consumer acceptConnection(Consumer c);
	
	public void notifyPublisher(String s);
	
	public void notifyBrokersOnChnages();
	
	public void pull(String s);
	
	
	public void filterConsumers(String s);
	
	
	
	
	
}
