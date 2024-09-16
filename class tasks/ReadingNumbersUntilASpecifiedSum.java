import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum{
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int value = userInput.nextInt();

		int sum = 0;
		int integer = 0;
		int counter = 1;
		
		while(sum<value){
		System.out.print("Enter an integer: ");
		integer = userInput.nextInt();
		sum+=integer;
			counter++;
			}
			System.out.println(sum + " " + "equals or greater than" + " " + value);
	




}




}