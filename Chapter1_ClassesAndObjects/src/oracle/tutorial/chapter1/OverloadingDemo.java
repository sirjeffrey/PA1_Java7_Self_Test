package oracle.tutorial.chapter1;

public class OverloadingDemo {
	public static double pow(double base) {
		return base*base;
	
	}
	
	public static double pow(double base, int number) {
		double result = 1.0;
		for(int i = 0; i<number; i++)
			result*=base;
		return result;
	
	}
}
