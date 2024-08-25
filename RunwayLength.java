import java.util.Scanner;

public class RunwayLength{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter a number in m/s:");
	int speed = input.nextInt();

	System.out.print("Please enter a number in m/s^2:");
	double acceleration = input.nextDouble();
	
	double calculatedSpeed = speed*speed;
	double calculatedAcceleration = 2*acceleration;
	double lengthOfRunway = calculatedSpeed / calculatedAcceleration;

	System.out.printf("The minimum runway length for this airplane is %.3f", lengthOfRunway);
	

	}




}