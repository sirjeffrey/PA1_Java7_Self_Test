package oracle.tutorial.chapter3;

import java.util.ArrayList;
import java.util.Collections;

public class StaatenQuiz {
	private ArrayList<Staat> liste;

	public StaatenQuiz() {
		super();
		this.liste = new ArrayList<Staat>();
	}
	public void addStaatToList(Staat staat){
		this.liste.add(staat);
	}
	public ArrayList<Staat> getStaatenListe(){
		return this.liste;
	}
	public void sortStaatenListe(){
		Collections.sort(liste);
	}
	public void showStaatenListe(){
		for(Staat staat : liste ){
			System.out.println(staat.toString());
		}
	}
}
