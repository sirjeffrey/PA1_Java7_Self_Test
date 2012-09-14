package oracle.tutorial.chapter3;

public class Staat implements Comparable<Staat>{
	private String name;
	private String hauptstadt;
	private long einwohner;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHauptstadt() {
		return hauptstadt;
	}
	public void setHauptstadt(String hauptstadt) {
		this.hauptstadt = hauptstadt;
	}
	public long getEinwohner() {
		return einwohner;
	}
	public void setEinwohner(long einwohner) {
		this.einwohner = einwohner;
	}
	public Staat(String name, String hauptstadt, long einwohner) {
		super();
		this.name = name;
		this.hauptstadt = hauptstadt;
		this.einwohner = einwohner;
	}
	@Override
	public int compareTo(Staat staat) {
		// TODO Auto-generated method stub
		return this.name.compareTo(staat.getName());
	
	}
	@Override
	public String toString() {
		return "Staat [name=" + name + ", hauptstadt=" + hauptstadt
				+ ", einwohner=" + einwohner + "]";
	}
	
}
