

import java.util.Scanner;

public class Exercise434{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = userInput.nextInt();
			int sum = 0;

			while (true){
				System.out.print("Enter a number or '0' to quit: ");
				int integer = userInput.nextInt();
				if (integer == 0) break;
				sum += integer;
				if (sum >= number) break;
			}
				System.out.print("The sum is: " + sum);
	}

}

