import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a three-digit integer:");
	int number = input.nextInt();

	int hundreds = number / 100;

	int remainder = number % 100;
	
	int tens = remainder % 10;

	if(hundreds == tens){
		System.out.printf("%d is a palindrome%n", number);
		}
	else{
		System.out.printf("%d is not a palindrome%n", number);
		
		}

	}

}