import java.util.Scanner;

public class HighestScore{

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
	    
	    int number;
	    String name = " ";
	    String highestName = " ";
	    int score;
	    int highestScore = 0;
	    int counter = 0;

	    System.out.print("Enter number of students: ");
	    number = input.nextInt();

	    while(counter < number){
	    counter = counter + 1;


            System.out.print("\nEnter name of student: ");
	    name = input.next();

	    System.out.print("Enter student's score: ");
	    score = input.nextInt();	
		
	        if(highestScore < score){
	        highestScore = score;
		highestName = name;

		 }

		}
		
		System.out.printf("%n%s has the highest score", highestName);

    }

}