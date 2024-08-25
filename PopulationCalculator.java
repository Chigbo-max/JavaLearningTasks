import java.util.Scanner;

public class PopulationCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the current world population: ");
	long population = input.nextLong();

	System.out.print("Enter the annual population growth rate: ");
	double growthRate = input.nextDouble();

	System.out.print("Enter a number of years: ");
	int years = input.nextInt();

	double estimatedWorldPopulation = population / Math.pow(growthRate, years);
	
	System.out.printf("By year %d, the estimated world population is %.0f%n", years, estimatedWorldPopulation);
	}



}