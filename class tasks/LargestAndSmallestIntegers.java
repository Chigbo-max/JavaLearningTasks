import java.util.Scanner;

public class LargestAndSmallestIntegers{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("\nEnter the first integer: ");
	int number1 = input.nextInt();

	System.out.print("\nEnter the second integer: ");
	int number2 = input.nextInt();
	
	System.out.print("\nEnter the thrird integer: ");
	int number3 = input.nextInt();

	System.out.print("\nEnter the fourth integer: ");
	int number4 = input.nextInt();

	System.out.print("\nEnter the fifth integer: ");
	int number5 = input.nextInt();

	int largest = number1;
	
	if (number2 > largest){
	 	largest = number2;
		}

	if (number3 > largest){
		largest = number3;
		}

	if (number4 > largest){
		largest = number4;
		}
	
	if (number5 > largest){
		largest = number5;
		}

	int smallest = number1;

	if (number2 < smallest){
		smallest = number2;
		}

	if (number3 < smallest){
		smallest = number3;
		}

	if (number4 < smallest){
		smallest = number4;
		}
	
	if (number5 < smallest){
		smallest = number5;
		}

	System.out.printf("%nThe largest integer is %d%n%n", largest);
	System.out.printf("The smallest integer is %d%n", smallest);

	
	












}











}