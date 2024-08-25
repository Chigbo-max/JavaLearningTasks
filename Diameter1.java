import java.util.Scanner;

public class Diameter1{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter the radius: ");
	
	double radius = input.nextDouble();

	double diameter = 2 * radius;
	double circumference = 2 * 3.14159 * radius;
	double area = 3.14159 * radius * radius;

System.out.printf("The size of the diameter is %.1f%n", diameter);
System.out.printf("The size of the circumference is %.1f%n", circumference);
System.out.printf("The size of the area is %.1f%n", area);
}

}
