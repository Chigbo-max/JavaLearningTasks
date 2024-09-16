import java.util.Scanner;

public class MathApp{
	public static void main(String... args){
	

	String menu = """
	
	==========

	1. Check if number is even
	2. Check square of number
	3. Check if number is square number
	4. Check factorial of number
	5. Check if number is palindrome
	6. Check if number is prime number
	7. Subtract 
	8. Divide
	9. Check the number of factors

	==========

	""";
	System.out.print(menu);
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int preferredNumber = userInput.nextInt();

	switch(preferredNumber){
	case 1 : System.out.println("Check if number is even");
		 
		System.out.println("Enter a number: ");
		int  evenNumberCheck = userInput.nextInt();
	System.out.println("The result is " + Kata.displayIsEven(evenNumberCheck));
	break;
	
	case 2 : System.out.println("Check square of number");
		 
		System.out.println("Enter a number: ");
		int  squareNumber = userInput.nextInt();
		System.out.println("The result is " + Kata.displayIsEven(squareNumber));
		break;

	case 3 : System.out.println("Check if number is square number");
		System.out.println("Enter a number: ");
		int  squareNumberCheck = userInput.nextInt();
		System.out.println("The result is " + Kata.displayIsSquare(squareNumberCheck));
		break;

	case 4 : System.out.println("Check factorial of number");
		System.out.println("Enter a number: ");
		int factorialCheck = userInput.nextInt();
		System.out.println("The result is " + Kata.factorialOf(factorialCheck));
		break;

	case 5 : System.out.println("Check if number is palindrome");
		System.out.println("Enter a number: ");
		int palindromeCheck = userInput.nextInt();
		System.out.println("The result is " + Kata.displayIsPalindrome(palindromeCheck));
		break;

	case 6 : System.out.println("Check if number is prime number");
		System.out.println("Enter a number: ");
		int primeNumberCheck = userInput.nextInt();
		System.out.println("The result is " + Kata.displayIsPrimeNumber(primeNumberCheck));
		break;

	case 7 : System.out.println("Subtract");
		System.out.println("Enter first number: ");
		int firstPrefferedNumber = userInput.nextInt();
		System.out.println("Enter second number: ");
		int secondPreferredNumber = userInput.nextInt();
		System.out.println("The result is " + Kata.subtract(firstPrefferedNumber, secondPreferredNumber));
		break;

	case 8: System.out.println("Divide");
		System.out.println("Enter numerator: ");
		int numerator = userInput.nextInt();
		System.out.println("Enter denominator: ");
		int denominator = userInput.nextInt();
		System.out.println("The result is " + Kata.divide(numerator, denominator));
		break;

	case 9: System.out.println("Check the number of factors");
 		System.out.println("Enter a number: ");
		int factorsCheck = userInput.nextInt();
		System.out.println("The result is " + Kata.displayFactorOf(factorsCheck));
		break;

	default: System.out.println("oops, you entered an invalid number, try again");

		}

	
	}


}