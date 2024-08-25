import java.util.Scanner;

public class LowestScore{

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
	    
	    int number = 0;
	    String name = " ";
	    String lowestName = " ";
	    String secondName = " ";
	    String secondLowestName = " ";
	    int score;
	    int lowestScore = 0;
	    int secondLowestScore = 0;
		
	    System.out.print("Enter number of student");
	    number = input.nextInt();

	    for(int counter = 0; counter < number; counter++){

            System.out.print("Enter name of student");
	    name = input.next();

	    System.out.print("Enter student's score");
	    score = input.nextInt();	
		
	        if(secondLowestScore < score){
	        secondLowestScore = score;
		secondLowestName = name;
		}
		else if(score < secondLowestScore){
		lowestScore = secondLowestScore;
		score = lowestScore;
		lowestName = name;
		}
	  }
		
		System.out.printf("%n%s has the lowest score", lowestName);

		System.out.printf("%n%s has the second lowest score", secondLowestName);


    }

}