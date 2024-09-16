import java.util.Scanner;
	
	public class LeapYear{


		public static void main(String... args){

			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter year: ");
			int number = userInput.nextInt();
			LeapYearCalculation.isLeapYear(number);


	}

}