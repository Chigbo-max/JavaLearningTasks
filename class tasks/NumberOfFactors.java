import java.util.Scanner;

public class NumberOfFactors{

	public static void main(String... args){
		
	Scanner userInput = new Scanner(System.in);

	System.out.println("Enter a number: ");

	int number = userInput.nextInt();

	int factors = 1;

	int counter; 

	for(counter = 1; counter <= number; counter++){

	if(counter % number==0)
	counter = counter + 1;

		
		}
				System.out.printf("%d is %d", counter);



	}


}