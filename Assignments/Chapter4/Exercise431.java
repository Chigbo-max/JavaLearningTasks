import java.util.Scanner;
public class Exercise431{
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a five digit integer: ");
		int number = userInput.nextInt();

		int fifthInteger = 0;
		int firstInteger = 0;

		if (number >= 10000 && number <= 99999 || number <= -10000 && number >= -99999){
			fifthInteger = number / 10000;
			int fourthInteger = number / 1000;
			int thirdInteger = number / 100;
			int secondInteger = number / 10;
			firstInteger = number % 10;
			}else{
			System.out.print("Number is not a five-digit integer");
			System.out.print("Enter a five digit integer: ");
			number = userInput.nextInt();
		 }

		if (fifthInteger == firstInteger){
		System.out.print("Number is a palindrome");
		}else{
		System.out.print("Number is not a palindrome");
		}



	}

}