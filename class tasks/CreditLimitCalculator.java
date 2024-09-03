import java.util.Scanner;

public class CreditLimitCalculator{
	public static void main(String... args){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		long accountNumber = userInput.nextLong();
		
		System.out.print("Enter balance for the beginning of the month: ");
		int beginningBalance = userInput.nextInt();

		System.out.print("Enter total charges for the month: ");
		int totalCharges = userInput.nextInt();
		
		System.out.print("Enter total credit for the month: ");
		int totalCredit = userInput.nextInt();

		System.out.print("Enter credit limit: ");
		int creditLimit = userInput.nextInt();

		int newBalance = beginningBalance + totalCharges - totalCredit;
		System.out.println("New balance is: " + newBalance);


	if(newBalance > creditLimit)
	System.out.println("Credit limit exceeded");
		
		
		
		










	}



}