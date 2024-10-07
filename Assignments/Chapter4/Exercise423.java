
import java.util.Scanner;

public class Exercise423{
	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);
	
	int largest = Integer.MIN_VALUE;
	int secondLargest = 0;
	int count = 0;
	int number = 0;

	while(count < 10){
		System.out.print("Enter a number: ");
		number = userInput.nextInt();
		count++;

		if (number > largest){
			secondLargest = largest;
			largest = number;
		}else if(number > secondLargest){
			secondLargest = number;
			}		
	}
	
		
	System.out.printf("Largest:%-5d Second Largest:%-5d", largest, secondLargest);

	}

}








