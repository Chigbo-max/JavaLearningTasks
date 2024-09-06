import java.util.Scanner;

public class ReversedNumber{

	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = userInput.nextInt();
		reverse(number);
		}

	public static void reverse(int originalNumber){
		
		int reverse = 0;
		while(originalNumber!=0){
		reverse = (reverse * 10) + (originalNumber % 10);
		originalNumber = originalNumber/10;
		
		}

	System.out.println("The reverse is: " + " " + reverse);
		}



}
