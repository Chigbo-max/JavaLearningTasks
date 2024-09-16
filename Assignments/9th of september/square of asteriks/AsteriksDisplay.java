import java.util.Scanner;

public class AsteriksDisplay{

	public static void main(String... args){
	
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = userInput.nextInt();

	SquareOfAsteriks.displayAsteriks(number);

		}



}