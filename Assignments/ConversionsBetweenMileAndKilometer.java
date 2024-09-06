import java.util.Scanner;

public class ConversionsBetweenMileAndKilometer{

	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = userInput.nextDouble();
		mileToKilometer(number);
		kilometerToMile(number);
	
		}


public static double mileToKilometer(double mile){
	
	double kilometers = 1.609344;
	convertedMileToKilometer = mile * kilometers;
	System.out.print(mile +" " + "=" + " " + convertedMileToKilometer);
	
	}

public static double kilometerToMile(double kilometer){
	
	double mile = 0.621371;
	convertedKilometerToMile = kilometer * mile;
	System.out.print(kilometer +" " + "=" + " " + convertedKilometerToMile);

	}


}

