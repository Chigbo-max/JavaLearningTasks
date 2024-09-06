
import java.util.Scanner;

public class SquareRootOfADouble{

	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a positive double value: ");
		double number = userInput.nextDouble();
	
		System.out.println("The square root of " + number + " " + "is" + " " + Math.sqrt(number));


		}


}