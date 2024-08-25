import java.util.Scanner;

public class GradeScore{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int score = input.nextInt();
	int counter = 1;


	while(counter<=10){

	if(score>=50)
	System.out.println("congratulations, you passed!");

	else if(score>70)
	System.out.println("congratulations, you passed!");

	if(score<50)
	System.out.println("sorry, you failed!");

	else if(score<45)
	System.out.println("sorry, you failed!");
	
	else if(score<30)
	System.out.println("sorry, you failed!");
	
	else if(score<22)
	System.out.println("sorry, you failed!");
	
	else if (score<10)
	System.out.println("sorry, you failed!");

	System.out.print("Enter a number: ");
	score = input.nextInt();

	counter++;
	}
	
}







}