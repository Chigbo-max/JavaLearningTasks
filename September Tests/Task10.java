import java.util.Scanner;

	public class Task10{

		public static void main(String... args){
		
		int sum = 0;
		int counter = 0;
		for(int count = 1; count <= 10; count++){
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter score: ");
			int scores = userInput.nextInt();
			
			if(scores >= 0 && scores <=100){
			sum += scores;
			counter++;
				}
				
			}

		System.out.println("Average is " + sum/counter);

	}




}