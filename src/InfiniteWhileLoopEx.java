
public class InfiniteWhileLoopEx {

	public static void main(String[] args) {

		// This code will continue endlessly unless I add a stop condition

		while (true) {
			int randomNum = ((int) (Math.random() * 10) + (int) (Math.random() * 100)); // this will generate a number
																						// from 1 to 10

			if (randomNum > 100) {
				continue;
			} else {
				System.out.println(randomNum);

				if (randomNum == 7) {
					System.out.println("7 has been found -- exit loop");
					break;
				}

			}

		}

	}

}
