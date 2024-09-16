import java.util.Scanner;

public class AreaOfATriangle{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an integer for point 1 :");
	double x1 = input.nextDouble();
	
	System.out.print("Enter an integer for point 1 :");
	double y1 = input.nextDouble();
	
	System.out.print("Enter an integer for point 2 :");
	double x2 = input.nextDouble();
	
	System.out.print("Enter an integer for point 2 :");
	double y2 = input.nextDouble();

	System.out.print("Enter an integer for point 3 :");
	double x3 = input.nextDouble();
	
	System.out.print("Enter an integer for point 3 :");
	double y3 = input.nextDouble();

	double side1 = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
	double side2 = Math.pow(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2), 0.5);
	double side3 = Math.pow(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2), 0.5); 
	
	double s = (side1 + side2 + side3)/2;

	double toCalculateArea = (s-side1)*(s-side2)*(s-side3);

	double areaCalculationContinued = s * toCalculateArea;
	
	double area = Math.pow(areaCalculationContinued, 0.5);
	
	System.out.printf("The area of the triangle is %.3f", area);
	



	








}








}