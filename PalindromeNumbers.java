import java.util.Scanner;

public class PalindromeNumbers{

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
	System.out.println("Enter a three-digit integer");
	int number = input.nextInt();

	int hundred = number/100;
	int remainder= number%10;
	int tens = remainder%10;

	if (hundred==tens)
	System.out.println("Number is a palindrome");
	else
	System.out.println("Number is not a palindrome");
	
    }


}