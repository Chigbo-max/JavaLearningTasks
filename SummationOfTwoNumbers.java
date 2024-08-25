import java.util.Scanner;

	public class SummationOfTwoNumbers{
	
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	
	char selection = ' ';

	do{
	
		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
	
		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();

		int sum = firstNumber + secondNumber;
		System.out.println("sum of first and second number is" +" "+ sum);

		System.out.println("Enter 'y' to continue or 'n' to quit");
		selection = input.next().charAt(0);
		
	}
	while(selection =='y' || selection!='n');
	
	System.out.println();
	
		

}





}