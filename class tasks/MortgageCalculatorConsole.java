/*
PSEUDO CODE:
1. Prompt the user to enter the amount to borrow
2. store step 1 as principal
3. Prompt the user to enter the duration of the mortgage in years
4. store step 3 as duration
5. prompt the user to enter the yearly interest rate offered on the mortgage
6. store step 5 as annual interest rate
7. multiply step 4 by 12 months
8. store step 7 as the calculated duration
9. multiply step 6 by percentage and divide the result by 12
10. store step 9 as the calculated monthly interest rate
11. perform a calculation where 1 is added to step 10 and the result is raised to the power of step 8
12. multiply step 11 by step 10
13. perform the calculation in step 11 again and subtract 1 from the result
14. divide the result of step 12 by the result of step 13
15. multiply the result of step 14 by the principal(step 2)
16. display the result as the monthly mortgage payment
17. if the user enters a principal amount less than zero, do not print result.
*/

import java.util.Scanner;

public class MortgageCalculatorConsole{

	public static void main(String... loanCalculator){

	Scanner userInput = new Scanner(System.in);

	System.out.println("Please enter the amount you wish to borrow: ");
	int principal = userInput.nextInt();

	System.out.println("Please enter the duration in years: ");
	double duration = userInput.nextInt();
	
	System.out.println("Please enter the yearly interest rate: ");
	double  annualInterestRate = userInput.nextInt();

	double calculatedDuration = duration * 12;
	
	double calculatedMonthlyInterestRate = (annualInterestRate * 0.01) / 12;
	

	double firstMonthlyMortgagePaymentCalculation = (Math.pow(calculatedMonthlyInterestRate + 1, calculatedDuration)) * calculatedMonthlyInterestRate;
	
	double secondMonthlyMortgagePaymentCalculation = (Math.pow(calculatedMonthlyInterestRate + 1, calculatedDuration))  - 1;
	
	double monthlyMortgagePayment = principal *(firstMonthlyMortgagePaymentCalculation / secondMonthlyMortgagePaymentCalculation);



	System.out.printf("Your monthly payment is $%.2f", monthlyMortgagePayment);



	}



}
