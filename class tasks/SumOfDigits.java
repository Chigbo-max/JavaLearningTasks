import java.util.Scanner;

public class SumOfDigits{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 and 1000: ");
	int digits = input.nextInt();

	int digitsLessThanTen = digits % 10;
	digits = digits / 10;

	int digitsBetweenTenAnd100 = digits % 10;
	digits = digits / 10;

	int digitsBetween100and999 = digits % 10;
	digits = digits /10;
 
	int sum = digitsLessThanTen + digitsBetweenTenAnd100 + digitsBetween100and999;

	System.out.printf("The sum of the digits is %d", sum);




	}





}