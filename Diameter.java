import java.util.Scanner;
public class Diameter{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer:");
	double radius = input.nextInt();
	double diameter = 2*radius;
	double circumference = 2*Math.PI*radius;
	double area = Math.PI*(radius*radius);
	System.out.printf("Diameter = %.4f%nCircumference = %.4f%nArea = %.4f%n", diameter, circumference, area);
	

}

}