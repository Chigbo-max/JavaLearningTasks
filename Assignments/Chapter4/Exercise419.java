import java.util.Scanner;

public class Exercise419{
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		int count  = 0;
		double grossSales = 0;
		double salesPersonEarnings = 0;

		while(true){
		System.out.print("Enter value of items sold in a week or -1 to quit " + " " + "(Item)" + (count + 1) + ": ");
		count++;
		double value = userInput.nextDouble();
		grossSales += value;
		if(value == -1) break;
		
		}
		salesPersonEarnings = 200 + 0.9 * grossSales;
		
		System.out.print("Salesperson's earnings is " + "$" + Math.round(salesPersonEarnings));


	}


}