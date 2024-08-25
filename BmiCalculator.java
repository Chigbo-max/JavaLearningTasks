import java.util.Scanner;

public class BmiCalculator{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number in pounds: ");
	double weight = input.nextDouble();

	System.out.print("Enter a number in inches: ");
	double height = input.nextDouble();
	
	double convertedPounds = weight*0.45359237;
	double convertedInches = height*0.0254;
	double newConvertedInches = convertedInches*convertedInches;

	double bmi = convertedPounds / newConvertedInches;

	System.out.printf("BMI is %.4f", bmi);

}



}