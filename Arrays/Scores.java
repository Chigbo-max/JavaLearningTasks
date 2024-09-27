import java.util.*;

	public class Scores{


		public static void main(String... args){
			Scanner userInput = new Scanner(System.in);

			System.out.print("Enter number of scores: " );

			int numberOfScores = userInput.nextInt();

			int[] scores = new int[numberOfScores];
			
			
			for(int count = 0; count < scores.length; count++){

				System.out.println("Enter scores " + (count + 1));

				scores[count] = userInput.nextInt();
			
				}

			System.out.printf("%n%s%10s%n","Index", "Scores");

			for(int count = 0; count < scores.length; count++){


			System.out.printf("%d%10d%n",count,scores[count]);
			}
			
	
		System.out.printf("%n%2s%d%n","Largest Score: ",calculateLargestScoreFrom(scores));
		System.out.printf("%2s%d%n","Lowest Score: ",calculateLowestScoreFrom(scores));
		
		System.out.printf("%s%.2f%n", "Average: ", calculateAverageScoreOf(scores));
	
	
		}




		public static int calculateLargestScoreFrom(int[] array){
			int largestScore = array[0];
			for(int count = 0; count < array.length; count++){
				if (array[count] > largestScore) largestScore = array[count];
					}
			return largestScore;
			}



		public static int calculateLowestScoreFrom(int[] array){
			int lowestScore = array[0];
			for(int count = 0; count < array.length; count++){
				if (array[count] < lowestScore) lowestScore = array[count];
					}

			return lowestScore;
			}
	

		public static double calculateAverageScoreOf(int[] array){
			int total = 0;
			for(int count = 0; count < array.length; count++){
				total += array[count];
				}
			double average = total/(array.length*1.0);
			return average;
			}



}