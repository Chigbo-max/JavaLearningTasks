import java.util.Scanner;

public class Multiples{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first intger: ");
	int num1 = input.nextInt();

	System.out.print("Enter second intger: ");
	int num2 = input.nextInt();

	int num1Tripled = num1 * num1 * num1;
	int num2Doubled = num2 * num2;

	if (num1Tripled%num2Doubled == 0){

	System.out.printf("%nThe first integer tripled IS A MULTIPLE of the the second number doubled%n");
	}
	else{
	System.out.printf("The first integer tripled IS NOT A MULTIPLE of the the second integer doubled%n"); 
	}
	}
}