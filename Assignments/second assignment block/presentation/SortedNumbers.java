import java.util.*;

public class SortedNumbers{

	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter first number: ");
	double firstNumber = userInput.nextDouble();

	System.out.print("Enter second number: ");
	double secondNumber = userInput.nextDouble();

	System.out.print("Enter third number: ");
	double thirdNumber = userInput.nextDouble();

	displaySortedNumbers(firstNumber, secondNumber, thirdNumber);

		}


	public static void displaySortedNumbers(double firstNumber, double secondNumber, double thirdNumber){
	
	double largest = firstNumber;
	
	if (firstNumber > secondNumber && firstNumber > thirdNumber)
		largest = firstNumber;

	if (secondNumber > firstNumber && secondNumber > thirdNumber)
		largest = secondNumber;

	if (thirdNumber > firstNumber && thirdNumber > secondNumber)
		largest = thirdNumber;




	 double secondLargest = firstNumber;

	if (firstNumber > secondNumber && firstNumber < thirdNumber)

		secondLargest = firstNumber;

	if (secondNumber > thirdNumber && secondNumber < firstNumber)

		secondLargest = secondNumber;

	if (thirdNumber > firstNumber && firstNumber < secondNumber)

		secondLargest = thirdNumber;


	
	double lowest = firstNumber;

	if (firstNumber < secondNumber && firstNumber < thirdNumber)

		lowest = firstNumber;

	if (secondNumber < firstNumber && secondNumber < thirdNumber)

		lowest = secondNumber;

	if (thirdNumber < firstNumber && thirdNumber < secondNumber)

		lowest = thirdNumber;


	System.out.printf("%d %d %d%n", (int)largest, (int)secondLargest, (int)lowest);
	
	}











}