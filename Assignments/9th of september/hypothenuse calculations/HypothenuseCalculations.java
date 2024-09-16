import java.util.Scanner;

public class HypothenuseCalculations{
	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter side1: ");
	double firstInput = userInput.nextDouble();
	
	System.out.print("Enter side2: ");
	double secondInput = userInput.nextDouble();
	
	System.out.print("The hypothenuse is" + " " +displayHypothenuse(firstInput, secondInput));

	}



public static double displayHypothenuse(double side1, double side2){


double hypothenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

return hypothenuse;


}


}