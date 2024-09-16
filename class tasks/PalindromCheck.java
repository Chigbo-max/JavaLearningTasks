import java.util.*;

public class PalindromCheck{

	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		int number = userInput.nextInt();
		System.out.println(isPalindrome(number));
		displayReverse(number);
		}

	public static boolean isPalindrome(int number){
		
		int firstDigit = 0;
		int secondDigit = 0;
		int thirdDigit = 0;

		firstDigit = number / 100;
		secondDigit = number / 10;
		thirdDigit = number % 10;

		return firstDigit == thirdDigit ? true : false;
		
		}



	public static int reverse(int number){
		
		int firstDigit = 0;
		int secondDigit = 0;
		int thirdDigit = 0;

		firstDigit = number / 100;
		secondDigit = (number / 10) %10;
		thirdDigit = number % 10;

		int reverse = (thirdDigit * 100) + (secondDigit * 10) + firstDigit;

		return reverse;

		}

	public static void displayReverse(int number){

		int reverse = reverse(number);
		
		System.out.println("The reverse is: " + " " + reverse);

		}



}