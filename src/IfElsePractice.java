import java.util.Scanner;
/*
 * Zachariah Zatina
 */
public class IfElsePractice {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int userAge;
		int ageDiff;
		
		System.out.print("Please enter your age: ");
		userAge = scnr.nextInt();
		
		if (userAge >= 18) {
			System.out.println("Congratulations you are old enough to vote!");
		}
		else if (userAge >= 16 && userAge < 18) {
			System.out.println("You're almost there! Head to voter education so you can learn about your civic duty!");
		}
		else {
			ageDiff = 18 - userAge;
			System.out.println("Sorry you are not old enough to vote, you have " + ageDiff + " years left.");
			System.out.println("Do some research on the voting process so you're prepared when you are able to vote.");
		}
		scnr.close();
	}

}
