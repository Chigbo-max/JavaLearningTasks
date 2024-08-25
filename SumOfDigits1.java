import java.util.Scanner;

public class SumOfDigits1{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 and 1000: ");
	int digits = input.nextInt();

	int digitsBetween100and999 = digits/100;

	int digitsBetweenTenAnd100 = (digits%100)/10;

	int digitsLessThan10 = digits%10;

	int sum = digitsBetween100and999 + digitsBetweenTenAnd100 + digitsLessThan10;

	System.out.printf("The sum of the digits is %d", sum);


	}





}