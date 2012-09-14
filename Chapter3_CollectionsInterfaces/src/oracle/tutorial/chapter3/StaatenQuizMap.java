package oracle.tutorial.chapter3;

import java.util.HashMap;

public class StaatenQuizMap {
	private HashMap<String, Staat> quizmap;

	public StaatenQuizMap() {
		super();
		this.quizmap = new HashMap<String, Staat> ();
	}
	public void addStaatToMap(String key , Staat staat){
		this.quizmap.put(key, staat);
	}
	public HashMap<String, Staat> getStaatenMap(){
		return quizmap;
	}
	public Staat getStaat(String key){
		return quizmap.get(key);
	}
	public void removStaat(String key){
		this.quizmap.remove(key);
	}
}
