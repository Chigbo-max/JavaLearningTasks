import java.util.Scanner;

public class Exercise420{
	public static void main(String... args){

	Scanner userInput = new Scanner(System.in);

	String name = "";
	double earnings = 0.0;
	int numberOfCitizens = 3;
	double tax = 0;
	double totalTax = 0;
	int count = 0;


	while(count < numberOfCitizens){
	System.out.print("Enter name ");
	name = userInput.nextLine();

	System.out.print("Enter earnings ");
	earnings = userInput.nextDouble();

	userInput.nextLine();


	if(earnings <= 30000){
		tax = earnings * 0.15;
		}
	else{
		double taxDifference = earnings - 30000;
		tax = (30000 * 0.15) + (0.2 * taxDifference);
		}

		totalTax += tax;


		count++;

	}
	


	System.out.print("Total tax is " + totalTax);


	}


}
