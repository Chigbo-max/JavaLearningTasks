import java.util.Scanner;

public class TaxCalculator{
	public static void main(String... args){

	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter earnings for the first citizen: ");
	double firstCitizenEarnings = userInput.nextDouble();
	
	System.out.print("Enter earnings for the second citizen: ");
	double secondCitizenEarnings = userInput.nextDouble();

	System.out.print("Enter earnings for the third citizen: ");
	double thirdCitizenEarnings = userInput.nextDouble();
	
	double firstCitizensTotalEarnings = 0;
	double secondCitizensTotalEarnings = 0;
	double thirdCitizenTotalEarnings = 0;

	if(firstCitizenEarnings <= 30000)
		firstCitizensTotalEarnings = 0.15 * firstCitizenEarnings;
	else
		firstCitizensTotalEarnings = 0.2 * firstCitizenEarnings;

	if(secondCitizenEarnings <= 30000)
		secondCitizensTotalEarnings = 0.15 * secondCitizenEarnings;
	else
		secondCitizensTotalEarnings = 0.2 * secondCitizenEarnings;

	if(thirdCitizenEarnings <= 30000)
		thirdCitizenTotalEarnings = 0.15 * thirdCitizenEarnings;

	else 
		thirdCitizenTotalEarnings = 0.2 * thirdCitizenEarnings;
	


	System.out.println("The total tax for the first citizen is: $" + firstCitizensTotalEarnings);
	System.out.println("The total tax for the second citizen is: $" + secondCitizensTotalEarnings);
System.out.println("The total tax for the third citizen is: $" + thirdCitizenTotalEarnings);



	}


}