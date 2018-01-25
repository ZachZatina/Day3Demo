
public class DoWhileLoopEx {
	
	public static void main(String[] args) {
		
		int i = 1;
		int month = 36;
		double futureVal = 0;
		double monthlyPmt = 330.63;
		double intRate = 5.99/100;
		
		do {
			
			futureVal = (futureVal + monthlyPmt) * (1 + intRate);
			i ++;
			
		} while (i <= month);
		
		System.out.println(futureVal);
		
	}

}
