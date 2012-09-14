package oracle.tutorial.chapter1;

public class Fach {
	private String bezeichnung;
	private int note;
	public Fach(String bezeichnung, int note) {
		super();
		this.bezeichnung = bezeichnung;
		this.note = note;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Fach [bezeichnung=" + bezeichnung + ", note=" + note + "]";
	}
	
	
}
