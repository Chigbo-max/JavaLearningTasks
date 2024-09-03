import java.util.Scanner;

public class NumberDivisibleBy4{
		public static void main(String... args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");

		int number = input.nextInt();
		
		if(number%4==0){
		System.out.println("This number is divisible by four");
		}
		else
		System.out.println("Sorry, this number is not divisible by four");

    }





}