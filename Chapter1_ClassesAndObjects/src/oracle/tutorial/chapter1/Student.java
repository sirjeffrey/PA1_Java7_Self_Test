package oracle.tutorial.chapter1;

import java.util.ArrayList;

public class Student extends Person{
	private String studienlehrgang;
	private int matNummer;
	private ArrayList<Fach> faecher = new ArrayList<Fach>();
	
	public Student(String name, String vorname, int alter, String studienlehrgang, int matNummer) {
		super(name, vorname, alter);
		this.studienlehrgang = studienlehrgang;
		this.matNummer = matNummer;
	}

	public String getStudienlehrgang() {
		return studienlehrgang;
	}

	public void setStudienlehrgang(String studienlehrgang) {
		this.studienlehrgang = studienlehrgang;
	}

	public int getMatNummer() {
		return matNummer;
	}

	public void setMatNummer(int matNummer) {
		this.matNummer = matNummer;
	}
	void addFach(Fach fach){
		faecher.add(fach);
	}
	ArrayList<Fach> getFaecherList(){
		return faecher;
	}
	
	double calculateAverageGrads(){
		double sumGrads = 0;
		
		for(Fach fach: faecher){
			sumGrads+=fach.getNote();
		
		}
		return (double)sumGrads/faecher.size();
	}
}
