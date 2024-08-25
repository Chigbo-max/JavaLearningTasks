import java.util.Scanner;

public class OddAndEvenNumbers{

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer");
	int number = input.nextInt();
	
	if(number%2==0)
	System.out.printf("%n%d is even number", number);
	else
	System.out.printf("%n%d is odd number", number);

    }



}