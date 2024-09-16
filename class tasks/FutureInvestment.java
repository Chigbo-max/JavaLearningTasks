import java.util.Scanner;



	public class FutureInvestment{

	public static void main(String... args){

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double investmentAmount = userInput.nextDouble();


		System.out.println("Enter interest rate: ");
		double interestRate = userInput.nextDouble();

		System.out.println("Enter number of years: ");
		int numberOfYears = userInput.nextInt();

		System.out.println("Years" + " " + "Future Value");
		futureInvestmentValue(investmentAmount, interestRate, numberOfYears);
	}



	public static double futureInvestmentValue(double investmentAmount, double interestRate, int numberOfYears){

		double monthlyInterestRate = (interestRate/100)/12;
		double futureInvestmentValue = 0;
		int count = 0;

		while(count!=numberOfYears){
		count++;

	
		futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), count*12);
		futureInvestmentValue+=1;

		System.out.printf("%d      %.2f", count, futureInvestmentValue);

		System.out.println();


			}

		return futureInvestmentValue;

		}


	


}