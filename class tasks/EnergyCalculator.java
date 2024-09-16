import java.util.Scanner;

public class EnergyCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the amount of water in kg: ");
	double amountOfWater = input.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter the final temperature: ");
	double finalTemperature = input.nextDouble();

	double calculatedTemperature = finalTemperature - initialTemperature;
	double energyNeeded = amountOfWater * calculatedTemperature * 4184;

	System.out.printf("The energy needed is %.1f", energyNeeded);

	}



}