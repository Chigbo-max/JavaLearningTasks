import java.util.Scanner;

public class PrimeNumber{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	int userInput = input.nextInt();
        
	int factor = 0;

	for(int count = 1; count<= userInput; count++){
	if(userInput%count == 0) factor++;
	
	}
	System.out.println(userInput + " " + "has" + " " + factor + " " + "factors");

	System.out.printf("%s %s a prime number%n", userInput, factor == 2?"is" : "is not");

	}



}


	/*if(factor == 2)
	System.out.print(userInput + " " + "is a prime number");
	else
	System.out.print(userInput + " " + "is a not a prime number");
	*/