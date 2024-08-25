import java.util.Scanner;

public class  {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a three-digit integer: ");
	int number = input.nextInt();

	int num1 = number / 100;
	int remaining = number % 100;
	int num3 = remaining % 10;

	if (num1 == num3)
		System.out.println("Palindrome is true");
	else
		System.out.println("Palindrome is false");
	


}
}