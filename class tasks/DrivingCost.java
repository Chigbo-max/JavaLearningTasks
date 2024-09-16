import java.util.Scanner;
public class DrivingCost{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a value:");
	double distance = input.nextDouble();
	System.out.print("Enter a value:");
	double fuelEfficiency = input.nextDouble();
	System.out.print("Enter a value:");
	double pricePerGallon = input.nextDouble();
	double costOfDriving = (distance/fuelEfficiency)*pricePerGallon;
	System.out.printf("The cost of driving is $%.2f",costOfDriving);

}

}