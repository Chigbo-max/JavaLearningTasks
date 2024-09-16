import java.util.Scanner;

public class GradeScore2{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);

	int average = 50;
	int counter = 1;
	
	for(counter = 1; counter<=10; counter++){

	System.out.print("Enter a number: ");
	int score = input.nextInt();

	if(score>=average)
	System.out.println("congratulations, you passed!");

	else
	System.out.println("sorry, you failed!");

		}
	
}





}