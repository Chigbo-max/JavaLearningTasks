import java.util.Scanner;
	public class Exercise511{
		public static void main(String... args){
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter number of values: ");
		
		int integer = userInput.nextInt();

		int counter = 1;
		int maximum = Integer.MIN_VALUE;
		int minimum = Integer.MAX_VALUE;
		do{
			System.out.print("Enter a number: ");
			int number = userInput.nextInt();
			if(number > maximum) maximum = number;
			if(number < minimum) minimum = number;
			counter++;

		}while(counter <= integer);

		int sum = maximum + minimum;
		
		System.out.println("Maximum: " + maximum + " " +"Minimum: " + minimum);
		System.out.print("Sum: " + sum);


	}

}