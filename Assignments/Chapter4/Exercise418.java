import java.util.*;

public class Exercise418{

	public static void main(String... args){ 
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNumber = userInput.nextInt();
	
		int creditLimit = 0;
		int beginningBalance = 0;
		int totalCharges = 0;
		int totalCredits = 0;
		int newBalance = 0;


		while(true){
		
			if ( accountNumber == -1) break;

			System.out.print("Enter beginning balance: ");
			beginningBalance = userInput.nextInt();

			System.out.print("Enter credit limit: ");
			creditLimit = userInput.nextInt();

			System.out.print("Enter total charges: ");
			totalCharges = userInput.nextInt();

			System.out.print("Enter total credits: ");
			totalCredits = userInput.nextInt();
			
			newBalance = beginningBalance + totalCharges- totalCredits;

			if (newBalance > creditLimit) System.out.println("Credit limit exceeded"); break;

			

		}
			System.out.println("New balance is  " + newBalance); 

	


	}



}