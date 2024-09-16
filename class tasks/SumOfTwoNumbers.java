import java.util.Scanner;

public class SumOfTwoNumbers{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);

	char selection= ' ';

	do{
		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();

		int sumOfFirstAndSecondNumber = firstNumber + secondNumber;
		
		System.out.println("sum of first and second number is " + " " +  			sumOfFirstAndSecondNumber);
			
		System.out.println("Enter 'y' to continue or 'n' to quit");
		selection = input.next().charAt(0);
	}
	while(selection == 'y' || selection != 'n');

	System.out.println();

	}

}