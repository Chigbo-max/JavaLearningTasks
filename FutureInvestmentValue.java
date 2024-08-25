import java.util.Scanner;

public class FutureInvestmentValue{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount invested: ");
	double investmentAmount = input.nextDouble();
	
	System.out.print("Enter annual interest rate in percentage: ");
	double interestRate = input.nextDouble();
	
	System.out.print("Enter numbers of years: ");
	double years = input.nextDouble();
	
	double monthlyInterestRate = interestRate / 12;
	
	double accumulatedValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years*12);
	
	System.out.printf("Accumulated value is %c%f", '$', accumulatedValue);



	
	

	


}

}