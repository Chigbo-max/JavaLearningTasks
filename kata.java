import java.util.Scanner;

public class Kata{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");

	int userInput = input.nextInt();

	System.out.println("Enter second number");
	
	int secondUserInput = input.nextInt();

	displayCalculatedDifference(userInput, secondUserInput);
	displayQuotient(userInput, secondUserInput);
	}




	public static void displayQuotient(int dividend, int divisor){
	int quotient = divisionCalculationToReturnQuotient(dividend, divisor);
	System.out.println("The quotient for" + " " + dividend + " " + "and" + divisor + " " + "is" + " " + quotient);
	}

	public static void displayCalculatedFactorial(int preferredNumber){
	int factorial = calculatedFactorial(preferredNumber);
	System.out.println("Factorial of" + " " + preferredNumber + " " + "is" + " " + factorial);
	}



	public static void displayPrimeNumbers(int choiceNumber){
	int factor = calculatedFactors(choiceNumber);
	if(factor == 2)
	System.out.println(choiceNumber + " " + "is a prime number");
	else
	System.out.println(choiceNumber + " " + "is a not a prime number");
	}

	public static void displayCalculatedFactors(int choiceNumber){
	int factor = calculatedFactors(choiceNumber);
	System.out.println(choiceNumber + " " + "has" + " " + factor + " " + "factors");
	}

	


	public static void displayCalculatedSquareofAnInteger(int preferredNumber){
	int squareOfANumber = calculatedSquareofAnInteger(preferredNumber);
	System.out.println("The square of" + " " + preferredNumber + " " + "is" + " " + squareOfANumber);
	}
	

	public static void displaySquareofAnIntegerDeterminant(int preferredNumber){
	int squareOfANumber = calculatedSquareofAnInteger(preferredNumber);
	if  (squareOfANumber % preferredNumber == 0)
	System.out.println(preferredNumber +" " + "is a square number");
	else
	System.out.println(preferredNumber + " " + "is not a square number");	
	}


	public static void displayEvenOrOddNumber(int choiceNumber){
	int factor = calculatedFactors(choiceNumber);
	if(choiceNumber % 2 == 0)
	System.out.println(choiceNumber + " " + "is a an even number");
	else
	System.out.println(choiceNumber + " " + "is an odd number");	
	}


	public static void displayPalindrome(int preferredNumber){

	int tenThousand = preferredNumber/10000;
	int oneThousand = preferredNumber/1000;
	int hundred = preferredNumber/100;
	int tens = preferredNumber/10;
	int remainder = preferredNumber%10;
	
	if (tenThousand==remainder)
	System.out.println(preferredNumber + " " + "is a palindrome");
	else
	System.out.println(preferredNumber + " " + "is not a palindrome");

	}
	
	public static int calculatedFactors(int sourceNumber){
	int factor = 0;
	for(int count = 1; count<=sourceNumber; count++){
	if(sourceNumber % count == 0)factor++;
	}
	return factor;

	}
	

	public static int calculatedPositiveDifference(int firstPreferredNumber, int secondPreferredNumber){
	int positiveDifference = Math.abs(firstPreferredNumber - secondPreferredNumber);
	
	return positiveDifference;
	}

	public static void displayCalculatedDifference(int firstPreferredNumber, int secondPreferredNumber){
	int positiveDifference = calculatedPositiveDifference(firstPreferredNumber, secondPreferredNumber);
	System.out.println("The positive difference of" + " " + firstPreferredNumber+ " " + "and" + " " + secondPreferredNumber + " " + "is" + " " + positiveDifference);
	}


	public static int calculatedSquareofAnInteger(int preferredNumber){
	int squareOfANumber;
	squareOfANumber = preferredNumber * preferredNumber;
	
	return squareOfANumber;
	}

	public static int calculatedFactorial(int preferredNumber){
	int factorial = 1;
	for(int count = 1; count<=preferredNumber; count++){
	factorial *= count;
	}
	return factorial;
	}
	
	public static int divisionCalculationToReturnQuotient(int dividend, int divisor){
	
	int quotient = dividend / divisor;

	return quotient;

	}

	



	
}





