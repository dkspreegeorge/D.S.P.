import java.util.ArrayList;

public interface Publisher extends Node {
	 public static final ChannelName channelName = new ChannelName();
	
	
	
	
	public void addHashTag(String s) ;
	public void removeHashTag(String s);
	public void getBrokerList();
	public Broker hashTopic(String s);
	public void push(String s, Value v);
	public void notifyFailure(Broker b);
	public void notifyBrokersForHashTags(String s);
	public ArrayList<Value> generateChucks(String s);
	
	
	

}
