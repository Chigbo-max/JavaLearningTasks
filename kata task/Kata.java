import java.util.Scanner;

public class Kata{


public static void displayDivide(int dividend, int divisor){
	float quotient = divide(dividend, divisor);
	System.out.println("The quotient for" + " " + dividend + " " + "and" + divisor + " " + "is" + " " + quotient);
	}

	public static void displayFactorialOf(int preferredNumber){
	long factorial = factorialOf(preferredNumber);
	System.out.println("Factorial of" + " " + preferredNumber + " " + "is" + " " + factorial);
	}



	public static int displayFactorOf(int choiceNumber){
	int factor = factorOf(choiceNumber);
	System.out.println(choiceNumber + " " + "has" + " " + factor + " " + "factors");
	return factor;
	}



	public static void displaySquareOf(int preferredNumber){
	long squareOfANumber = squareOf(preferredNumber);
	System.out.println("The square of" + " " + preferredNumber + " " + "is" + " " + squareOfANumber);
	}
	


	public static boolean displayIsPrimeNumber(int choiceNumber){
	int factor = factorOf(choiceNumber);

	return factor == 2 ? true : false;
	}

	public static boolean displayIsSquare(int preferredNumber){
	double resultOfASquaredNumber = Math.sqrt(preferredNumber);

	double squaredNumber = resultOfASquaredNumber * resultOfASquaredNumber;

	return preferredNumber == squaredNumber ? true : false;
	}


	public static boolean displayIsEven(int choiceNumber){
	int factor = factorOf(choiceNumber);

	return choiceNumber % 2 == 0? true : false;
	}


	public static boolean displayIsPalindrome(int preferredNumber){

	int tenThousand = preferredNumber/10000;
	int oneThousand = preferredNumber/1000;
	int hundred = preferredNumber/100;
	int tens = preferredNumber/10;
	int remainder = preferredNumber%10;
	
	return tenThousand == remainder? true : false;
	}
	
	public static int factorOf(int sourceNumber){
	int factor = 0;
	for(int count = 1; count<=sourceNumber; count++){
	if(sourceNumber % count == 0)factor++;
	}
	return factor;

	}

	public static int subtract(int firstPreferredNumber, int secondPreferredNumber){
	return firstPreferredNumber > secondPreferredNumber ? firstPreferredNumber - secondPreferredNumber : 	secondPreferredNumber - firstPreferredNumber; 
	}

	public static void displaySubtract(int firstPreferredNumber, int secondPreferredNumber){
	int positiveDifference = subtract(firstPreferredNumber, secondPreferredNumber);
	System.out.println("The positive difference of" + " " + firstPreferredNumber+ " " + "and" + " " + secondPreferredNumber + " " + "is" + " " + positiveDifference);
	}


	public static long squareOf(int preferredNumber){
	long squareOfANumber;
	squareOfANumber = preferredNumber * preferredNumber;
	
	return squareOfANumber;
	}

	public static long factorialOf(int preferredNumber){
	long factorial = 1;
	for(int count = 1; count<=preferredNumber; count++){
	factorial *= count;
	}
	return factorial;
	}
	
	public static float divide(int dividend, int divisor){
	float quotient;
	if(divisor == 0) quotient = 0;
	else
	quotient = dividend / divisor;
	return quotient;

	}


	
}




