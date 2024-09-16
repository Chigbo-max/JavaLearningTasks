import java.util.Scanner;

public class GradeScore3{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);

	int counter = 1;

	int passed = 0;
	int failed = 0;

	while(counter<=10){

	System.out.print("Enter a number: ");
	int score = input.nextInt();

	if(score < 50){
	score = failed;
	failed = failed + 1;
	}
	if(score>=50){
	score = passed;
	passed = passed + 1;
	}
	counter++;
		}
	System.out.println("Total number of students that passed is: " + " " + passed);
	System.out.println("Total number of students that failed is:" + " " + failed);

	}

}