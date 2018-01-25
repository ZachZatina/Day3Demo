/*
 * Zachariah Zatina
 */
public class JavaBasics {

	public static void main(String[] args) {
		
		final String TEST = "hello";
		byte b = 127;
		short s = 32767;
		int i = 1254264;
		float fl = 6.7f;
		double d = 5.6667;
		char c = 'c';
		boolean bool = true;
		long l = 542542542542542l;
		
		//implicit casting examples
		int numOfItems = 5;
		System.out.println(3.0/1.5);
		System.out.println(3.0/2);
		System.out.println((numOfItems + 10) / 2);
		System.out.println((numOfItems = 10) / 2.0);
		
		//explicit casting (type casting)
		double x = (double) (3/5);
		System.out.println(x);
		x = (double) 3 / (double) 5;
		System.out.println(x);
		
		//example 2 -- common error forgetting to cast
		int kidsInFamily1 = 3;
		int kidsInFamily2 = 4;
		int numOfFamilies = 2;
		
		double avgKidsPerFamily = (kidsInFamily1 + kidsInFamily2) / (double) numOfFamilies;
		
		System.out.println(avgKidsPerFamily);
		System.out.println(numOfFamilies);
		
		
		
		
	}

}
