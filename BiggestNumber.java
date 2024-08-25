import java.util.Scanner;

public class BiggestNumber{
	public static void main(String... args){

	Scanner biggestNumberInput = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int firstNumber = biggestNumberInput.nextInt();

	System.out.println("Enter second number");
	int secondNumber = biggestNumberInput.nextInt();

	System.out.println("Enter third number");
	int thirdNumber = biggestNumberInput.nextInt();
	
	int biggest = firstNumber;
	
	if (secondNumber>biggest) biggest = secondNumber;
	if (thirdNumber>biggest)  biggest = thirdNumber;
	
	System.out.println("biggest is: " + biggest);










}






}