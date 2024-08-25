import java.util.Scanner;

public class PrimeNumbersAndNumberOfFactors{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	int userInput = input.nextInt();
	displayPrimeNumbers(userInput);
	}

	public static void displayPrimeNumbers(int secondNumber){
	int factor = calculatedFactors(secondNumber);
	System.out.printf("%s %s a prime number", secondNumber, factor==2? "is" : "is not");
	}

	public static void displayCalculatedFactors(int firstNumber){
	int factor = calculatedFactors(firstNumber);
	System.out.println(firstNumber + " " + "has" + " " + factor + " " + "factors");
	}
	

	public static int calculatedFactors(int sourceNumber){
	int factor = 0;
	for(int count = 1; count<=sourceNumber; count++){
	if(sourceNumber % count == 0)factor++;
	}
		return factor;


	}
	

}


	/*prime numbers are numbers divided by 1 and itself.
	upon adding up the factors of the user's input, the primenumbers are retrieved i.e 	numbers only divided by one and itself e.g 11 is a prime number as 11 can only be /	/divided by 1 and 11 without a remainder, 10 is not a prime number because it can be 	divided by 4 numbers without a remainder*/