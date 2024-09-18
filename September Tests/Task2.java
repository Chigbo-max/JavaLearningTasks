import java.util.Scanner;

	public class Task2{

		public static void main(String... args){
		
		
		int sum = 0;
		int counter = 0;
		for(int count = 1; count <= 10; count++){
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter score: ");
			int scores = userInput.nextInt();
			sum += scores;
			counter++;
			}
		System.out.print("Average is " + sum/counter);

	}




}