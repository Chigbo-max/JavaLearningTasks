import java.util.Scanner;

public class NumberDivisibleBy4and5Test3{
		public static void main(String... args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");

		int number = input.nextInt();
		
		if((number%4==0) ^ (number%5==0)){ //^operator is true if and 
						   //only if its operands is
						   //true and the other is false
		System.out.println("This number is divisible by four and 5");
		}
		else
		System.out.println("Sorry, this number is not divisible by four and five");

    }





}