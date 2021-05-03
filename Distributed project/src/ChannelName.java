import java.util.ArrayList;
import java.util.HashMap;


//--------------------------------------------------------
//--------------------------------------------------------
//                    done
//--------------------------------------------------------
//--------------------------------------------------------



/**
* <p> class
* thats a class that has 3 attributes
* got some setters and getters for now 
* 1 default constructor and
* 1 constructor that set its attributes
* @param String channelName
* ArrayList<String> hashtagsPublished
* HashMap<String,ArrayList<Value>> userVideoFilesMap
* @author Zeromaker
*/
public class ChannelName {
	
	
	
	
	/**
	* String channelName
	*/
	public String channelName;
	
	/**
	* ArrayList<String> hashtagsPublished
	*/
	private ArrayList<String> hashtagsPublished;
	
	/**
	*HashMap<String,ArrayList<Value>> userVideoFilesMap
	*/
	private HashMap<String,ArrayList<Value>> userVideoFilesMap;
	
	ChannelName(){}
	
	
	ChannelName(String channelName,ArrayList<String> hashtagsPublished ,HashMap<String,ArrayList<Value>> userVideoFilesMap){
		
		setChannelName(channelName);
		setHashtagsPublished(hashtagsPublished);
		setUserVideoFilesMap(userVideoFilesMap);
	}
	
	
	//--------------------------------------------------------
	//--------------------------------------------------------
	//                    methods
	//--------------------------------------------------------
	//--------------------------------------------------------
	/**
	* @return the channel name
	*/
	public String getChannelName() {
		
		
		return channelName;
	}


	/**
	* Set the channel name
	* needs a string
	* @return void
	*/
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}


	public ArrayList<String> getHashtagsPublished() {
		return hashtagsPublished;
	}


	/**
	* Set the channel name
	* @param ArrayList<String>
	* @return void
	*/
	public void setHashtagsPublished(ArrayList<String> hashtagsPublished) {
		this.hashtagsPublished = hashtagsPublished;
	}


	/**
	* Get the user video files
	* @return userVideoFilesMap. its a HashMap<String, ArrayList<Value>>
	*/
	public HashMap<String, ArrayList<Value>> getUserVideoFilesMap() {
		return userVideoFilesMap;
	}

	/**
	* Set the channel name
	* @param ArrayList<String>
	* @return void
	*/
	public void setUserVideoFilesMap(HashMap<String, ArrayList<Value>> userVideoFilesMap) {
		this.userVideoFilesMap = userVideoFilesMap;
	}



	
	

	
	
	
	
	

}