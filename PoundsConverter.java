import java.util.Scanner;
public class PoundsConverter{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter a value in pounds: ");

	double value = input.nextDouble();	
	double onePound_To_oneKilogram = 0.454;
	double convertedValue= value*0.454;

System.out.printf("%n%.1f pounds is %.3f kilograms%n", value, convertedValue);

}

}