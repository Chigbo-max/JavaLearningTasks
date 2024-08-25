import java.util.Scanner;

public class GradeScore1{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	
	
	int average = 50;
	int counter = 1;


	while(counter<=15){
	
	System.out.print("Enter a number: ");
	int score = input.nextInt();

	counter++;
	
	if(score>=50)
	System.out.println("congratulations, you passed!");

	else
	System.out.println("sorry, you failed!");



	}
	
}







}