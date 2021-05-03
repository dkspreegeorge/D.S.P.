import java.util.ArrayList;

public class PublisherImpl implements Publisher{
	//constructor
	PublisherImpl(){}
	
	
	//all methods

	@Override
	public void init(int i) {
		//prepei kapws na prosdiorisw to channel name
		channelName.setChannelName("xd");
		
	}

	@Override
	public ArrayList<Broker> getBrokers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void discconect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateNodes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addHashTag(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeHashTag(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBrokerList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Broker hashTopic(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(String s, Value v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyFailure(Broker b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyBrokersForHashTags(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Value> generateChucks(String s) {

		
		
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("ITS ME PUBLISHER");
	}

}
