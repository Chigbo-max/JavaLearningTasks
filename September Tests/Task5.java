import java.util.Scanner;

	public class Task5{

		public static void main(String... args){
		
		
		int sum = 0;
		for(int count = 1; count <= 10; count++){
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter score: ");
			int scores = userInput.nextInt();
			if(scores % 2 == 0)
			sum += scores;


			}
		System.out.println("Sum of the even numbers is " + sum);


	}




}