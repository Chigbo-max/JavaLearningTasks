import java.util.Scanner;

public class VolumeOfATriangle{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the length of sides: ");
	double length = input.nextDouble();

	System.out.print("Enter the height: ");
	double height = input.nextDouble();

	double area = 1.7321 * (length * length);
	double calculatedArea = area / 4;
	double volume = calculatedArea * height;

	System.out.printf("The volume of the triangular prism is %.2f", volume);
	
	

	}


}