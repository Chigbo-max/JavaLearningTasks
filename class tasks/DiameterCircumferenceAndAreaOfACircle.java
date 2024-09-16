import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the radius of a circle: ");
	double radius = input.nextDouble();

	double diameter = 2 * radius;
	double circumference = 2 * Math.PI * radius;
	double area = Math.PI * (radius * radius);
	
	System.out.printf("%nThe DIAMETER is %.1f%n%n", diameter);
	System.out.printf("The CIRCUMFERENCE is %.1f%n%n", circumference);
	System.out.printf("The AREA is %.1f%n%n", area);


	}

}