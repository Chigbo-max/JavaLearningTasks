import java.util.Scanner;

public class PalindromeInteger{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a three-digit integer: ");
	int number = input.nextInt();

	int num1 = number / 100;
	int remainder = number % 100;
	int num3 = remainder % 10;

	if (num1 == num3)
		System.out.printf("%d is not a Palindrome%n", number);
	else
		System.out.printf("%d is a Palindrome%n", number);
	


}
}