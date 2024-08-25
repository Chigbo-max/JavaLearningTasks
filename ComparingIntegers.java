import java.util.Scanner;

public class ComparingIntegers{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");

	int number1 = input.nextInt();

	int number2 = number1 * number1;
	
if (number1 == 100){
	System.out.printf("%d == %d%n", number1, 100);
	}

if (number1 != 100){
	System.out.printf("%d != %d%n", number1, 100);
	}	
	
if (number1 > 100){
	System.out.printf("%d > %d%n", number1, 100);
	}	
	
if (number1 < 100){
	System.out.printf("%d < %d%n", number1, 100);
	}


if (number2 == 100){
	System.out.printf("%d != %d%n", number2, 100);
	}

if (number2 != 100){
	System.out.printf("%d != %d%n", number2, 100);
	}

if (number2 > 100){
	System.out.printf("%d > %d%n", number2, 100);
	}

if (number2 < 100){
	System.out.printf("%d < %d%n", number2, 100);
	}



	}


}