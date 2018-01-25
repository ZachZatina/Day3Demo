import java.util.Scanner;

public class WhileLoopEx {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			// Your code should start here
			
			System.out.println("Do some stuff");
			
			
			// this is where your code should end
			System.out.print("Do you want to continue? (y/n): ");
			cont = scnr.nextLine();
			
		}
		
		//Let the user know the program has ended
		System.out.println("Goodbye");
		
		
		scnr.close();
		
	}

}
