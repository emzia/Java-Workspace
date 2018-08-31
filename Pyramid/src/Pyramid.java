import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please specify a pyramid height: ");
		int height = input.nextInt();
		System.out.println("Printing pyramid with height of " + height + ".....");
		for (int x = 1; x < height+1; x++) {
			for (int y = 0; y < x; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
