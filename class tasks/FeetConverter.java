import java.util.Scanner;
public class FeetConverter{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a value for feet:");
	double value = input.nextDouble();	
	double OneMeter = 0.305;
	double convertedValue= value*0.305;
System.out.printf("%.1f feet is %.4f meters", value, convertedValue);

}

}