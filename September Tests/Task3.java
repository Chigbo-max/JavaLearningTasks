import java.util.Scanner;

	public class Task3{

		public static void main(String... args){
		
		
		int sum = 0;
		for(int count = 1; count <= 10; count++){
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter score: ");
			int scores = userInput.nextInt();
			sum += scores;

			}
		System.out.println("Sum is " + sum);
		System.out.print("Average is " + sum/10);


	}




}