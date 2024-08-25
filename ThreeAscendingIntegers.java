import java.util.Scanner;

public class ThreeAscendingIntegers{
	public static void main(String... args){
	 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter a number: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter a number: ");
		int number3 = input.nextInt();

		int count = 0;
	
		
		if(number2 < number1){
			count = number1;
			number1 = number2;
			number2 = count;
		}

		if(number3 < number1){
			count = number1;
			number1 = number3;
			number3 = count;
		}
		if(number3 < number2){
			count = number2;
			number2 = number3;
			number3 = count;
		}

		System.out.print(number1 + " " + number2 + " " + number3);
	}




}