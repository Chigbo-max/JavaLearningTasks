import java.util.Scanner;

public class PrimeNumbers{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number or 1 to quit: ");
	int number = input.nextInt();

	while(number!=1){
	
	if (number>2 && number<11 && number%2 != 0)
	System.out.println("number is a prime number");

	else if (number==2)
	System.out.println("number is a prime number");

	else if (number>=2 && number<11 && number%2 == 0)
	System.out.println("number is not a prime number");
	
	else if (number>=11 && number>11 && number%2 != 0)
	System.out.println("number is a prime number");
	
	else if (number>=11 && number%3 != 0)
	System.out.println("number is a prime number");
	
	else if (number>=11 && number%3 == 0)
	System.out.println("number is not a prime number");

	else if (number>=11 && number>11 && number%2 != 0)
	System.out.println("number is a prime number");
	
	System.out.println("Enter a number or 1 to quit: ");
	number = input.nextInt();

	}
}




}