import java.util.*;

public class Patterns{

	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int choice = userInput.nextInt();
	displayPattern(choice);
	}




public static void displayPattern(int number){
	for(int count = 1; count<=number; count++){

		for(int counter = count; counter<= number; counter++){
		System.out.print("  ");
		}

		for(int counter = 1; counter<count; counter++){
		System.out.printf("%d ",counter);
		}

		//for(int counter = count; counter>=1; counter--){
		//System.out.printf("%d ", counter);
		//}
		

	System.out.println();
	}




	}


}
