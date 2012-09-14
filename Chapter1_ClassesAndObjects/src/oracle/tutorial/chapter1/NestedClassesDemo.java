package oracle.tutorial.chapter1;

public class NestedClassesDemo {
	private String outName;
	static String staicAttribut = "Hallo from the out class";

	public NestedClassesDemo(String outName) {
		super();
		this.outName = outName;
	}

	public String getName() {
		return outName;
	}

	public void setName(String outName) {
		this.outName = outName;
	}
	 class InsideClass{
		private String inName;

		 InsideClass(String inName) {
			super();
			this.inName = inName;
		}
		 String showInfo(){
			return "OutClassName:"+" "+outName+" "+"InClassName:"+inName;
		}
	}
	 static class StaticNesstedClass{
		 String getStaicAttribut(){
			 return staicAttribut;
		 }
	 }
}
