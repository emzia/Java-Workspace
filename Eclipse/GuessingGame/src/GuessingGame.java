import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		
		do {
			System.out.println("Guess a number between 1 and 1000: ");
			guess = input.nextInt();
			numberOfTries++;
		
			if (guess == numberToGuess) {
				System.out.println("You won!");
			}
			else if (guess < numberToGuess) {
				System.out.println("Your guess is too low!");
			}
			else if (guess > numberToGuess) {
				System.out.println("Your guess is too high!");
			}
		}
		while (guess != numberToGuess);
		System.out.println("It took you " + numberOfTries + " tries.");
	}

}
