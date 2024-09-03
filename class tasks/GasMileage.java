import java.util.Scanner;

public class GasMileage{

	public static void main(String... args){

	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter number of trips: ");
	int trips = userInput.nextInt();

	
	int totalMiles = 0;
	int totalGallons = 0;

	int counter = 1;
	while(counter <= trips){
	System.out.println("Enter number of miles driven: ");
	int milesDriven = userInput.nextInt();
	totalMiles += milesDriven;
	
	System.out.println("Enter number of gallons used: ");
	int gallonsUsed = userInput.nextInt();
	totalGallons += gallonsUsed;

	
	float milesPerGallon = milesDriven/gallonsUsed;
	
	
	counter++;
	}
	
	float combinedMilesPerGallon = totalMiles / totalGallons;
	
	System.out.println("Combined miles per gallon: " + combinedMilesPerGallon);

	}




}








