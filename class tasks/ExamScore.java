import java.util.Scanner;

public class ExamScore{

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
	int number = 0;

	while(number!=-1){
	 number++;
	System.out.println("Enter your score or -1 to quit");
	 number = input.nextInt();

	    if(number>=60){
	    System.out.println("You pass the exam");
	    }
	    else{
	    System.out.println("You don't pass the exam");
	    }

		
	}	

    }
}	