import java.util.*;

	public class ScoresCollection{


		public static void main(String... args){
			Scanner userInput = new Scanner(System.in);

			System.out.print("Enter number of scores: ");

			int numberOfScores = userInput.nextInt();

			int[] scores = new int[numberOfScores];
			
			
			for(int count = 0; count < scores.length; count++){

				System.out.print("Enter scores: ");

				scores[count] = userInput.nextInt();
			
				}

			
	
		System.out.printf("%n%s%10s%n","Index", "Scores");

		int largestScore = scores[0];
		int lowestScore = scores[0];
		int total = 0;

	

		for(int count = 0; count < scores.length; count++){

		if (scores[count] > largestScore)
				
			largestScore = scores[count];

		if (scores[count] < lowestScore)
				
			lowestScore = scores[count];
		
		total += scores[count];

		System.out.printf("%d%10d%n",count,scores[count]);

			}

		System.out.printf("%n%2s%d%n","Largest Score: ",largestScore);
		System.out.printf("%2s%d%n","Lowest Score: ",lowestScore);
		
		double average = total/(scores.length*1.0);
		System.out.printf("%s%.2f%n", "Average: ", average);
	
	}


}