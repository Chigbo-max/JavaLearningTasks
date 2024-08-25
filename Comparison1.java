import java.util.Scanner;

public class Comparison1{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter integer one: ");
	int number1 = input.nextInt();

	System.out.print("Enter integer two: ");
	int number2 = input.nextInt();

	if (number1>number2){
		System.out.print("number one is greater\n");
	}
	else {

		System.out.print("number two is greater\n");
	}

	if (number1==number2){

		System.out.print("number one is equal to number two\n");
	}

	else {

		System.out.print("number one is not equal to two");

	}




	}







}