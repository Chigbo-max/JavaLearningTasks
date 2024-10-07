
import java.util.Scanner;

public class Exercise421{
	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);
	
	int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;
	int count = 0;
	int number = 0;

	while(count < 10){
		System.out.print("Enter a number: ");
		number = userInput.nextInt();
		count++;

		if (number > largest) largest = number;		
		if(number < smallest) smallest = number;
	}
		
	System.out.printf("Largest:%-5d Smallest:%-5d", largest, smallest);

	}

}








