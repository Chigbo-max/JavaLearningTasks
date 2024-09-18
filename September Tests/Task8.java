import java.util.Scanner;

	public class Task8{

		public static void main(String... args){
		
		int sum = 0;
		int count = 0;

		while(count >= 0){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter score: ");
		int scores = userInput.nextInt();
			if(scores >= 0 && scores <= 100){
				count++;
				sum+=scores;

				}
		
			if(count == 10){
	
				System.out.println("Sum is " + sum);
				break;
				}

			}

		}

}



