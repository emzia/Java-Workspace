import java.util.Scanner;

public class TwentyOneSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numSticks = 21;
		Scanner input = new Scanner(System.in);
		Scanner take = new Scanner(System.in);
		
		System.out.println("Would you like to first? (y/n)");
		String goFirst = input.nextLine().toLowerCase();
		
		if (goFirst.equals("y")) {
			System.out.println("You are going first.");
		}
		else {
			System.out.println("The computer is going first.");
		}
		
		while (numSticks > 0) {
			int numToTake = 0;
			while (numToTake != 1 || numToTake != 2) {
				System.out.println("How many sticks to take? (1 or 2)");
				numToTake = take.nextInt();
			}
			System.out.println("There are " + numSticks + " sticks");
			numSticks -= numToTake;
			
		}
		
	}

}
