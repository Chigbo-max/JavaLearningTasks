import java.util.Scanner;

	public class ValueOfANumberRaisedToAnotherValue{
	
	public static void main(String... args){
	
	Scanner enteredValue = new Scanner(System.in);
	
	System.out.println("Enter a number as the base: ");
	int base = enteredValue.nextInt();
	
	System.out.println("Enter a number as the power: ");
	int power = enteredValue.nextInt();

	int outcome = 1;
	
	while(power!=0){
	outcome = outcome*base;
	power--;
	}

	System.out.println("The value of the base raised to the power is: " + " " 	+ outcome);
	
	

	}




}