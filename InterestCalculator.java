import java.util.Scanner;
	public class InterestCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter balance: ");
	int currentBalance = input.nextInt();

	System.out.print("Enter	a number: ");
	double annualInterestRate = input.nextDouble();

	double calculatedCurrentBalance = currentBalance * annualInterestRate;

	double interestForTheNextMonth = calculatedCurrentBalance / 1200;

	System.out.printf("The interest is %.5f", interestForTheNextMonth);





	}
}