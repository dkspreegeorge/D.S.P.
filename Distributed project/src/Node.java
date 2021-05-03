import java.awt.List;
import java.util.ArrayList;

public interface Node {
	
 
	ArrayList<Broker> broker = new ArrayList<Broker>();

	
	public void init(int i);
	public ArrayList<Broker> getBrokers();
	public void connect();
	public void discconect();
	public void updateNodes();
	
}
