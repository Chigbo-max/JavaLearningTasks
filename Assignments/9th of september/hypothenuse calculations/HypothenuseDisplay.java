import java.util.Scanner;

public class HypothenuseDisplay{
	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter side1: ");
	double firstInput = userInput.nextDouble();
	
	System.out.print("Enter side2: ");
	double secondInput = userInput.nextDouble();
	
	System.out.printf("%s %.1f","The hypothenuse is", HypothenuseCalculations.displayHypothenuse(firstInput, secondInput));

	}






}