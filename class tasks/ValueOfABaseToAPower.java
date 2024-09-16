import java.util.Scanner;

public class ValueOfABaseToAPower{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number as base: ");
	int base = input.nextInt();

	System.out.println("Enter a number as power: ");
	int power = input.nextInt();

	int result = 1;

	while(power!=0){
	result = result*base;
	power--;
	}
	System.out.println("the value of the base to the power is:" + " " + result);

}
	
	




}