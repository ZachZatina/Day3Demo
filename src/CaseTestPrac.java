import java.util.Scanner;

public class CaseTestPrac {

	public static void main(String[] args) {
		
		int caseSwitch = 1;
		switch (caseSwitch) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 1");
			break;
		default:
			System.out.println("Default case");
			break;
		}
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter a grade: ");
		double grade = scnr.nextDouble();
		
		switch((int)grade / 10) {
		case 1:
			System.out.println("10 -19");
			break;
		case 2:
			System.out.println("20 - 29");
			break;
		case 3:
			System.out.println("30 - 39");
			break;
		default:
			System.out.println("Your number didn't match");
			break;
		}
		System.out.println("Goodbye");

	}

}
