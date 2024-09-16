import java.util.Scanner;

public class AverageAcceleration{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter a number in m/s:");
	double startingVelocity = input.nextDouble();
	
	System.out.print("Please enter a number in m/s:");
	double endingVelocity = input.nextDouble();

	System.out.print("Please enter a number in secs:");
	double timeSpan = input.nextDouble();

	double changeOfVelocity = endingVelocity - startingVelocity;
	
	double averageAcceleration = changeOfVelocity/timeSpan;
	
	System.out.printf("The average acceleration is %.4f", averageAcceleration);
}

}