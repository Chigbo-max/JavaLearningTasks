import java.util.Scanner;

	public class Task4{

		public static void main(String... args){
		
		
		int sum = 0;
		for(int count = 1; count <= 10; count++){
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter score: ");
			int scores = userInput.nextInt();
			if(count % 2 == 0)
				sum += count;

			}
		System.out.println("Sum of the even indexes is " + sum);


	}




}