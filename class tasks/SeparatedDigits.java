import java.util.Scanner;

	public class SeparatedDigits{
	
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter five digits: ");

	int digits = input.nextInt();

	int firstDigit = digits/10000;
	int secondDigit = (digits%10000)/1000;
	int thirdDigit = (digits%1000)/100;
	int fourthDigit = (digits%100)/10;
	int fifthDigit = digits%10;

	System.out.printf("%d   %d   %d   %d   %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
}



}