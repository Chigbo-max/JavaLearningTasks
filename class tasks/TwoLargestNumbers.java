import java.util.Scanner;

public class TwoLargestNumbers{
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		int largest = 0;
		int secondLargest = 0;
		int integer = 0;
		int counter = 0;
		
		while(counter<=10){
		System.out.print("Enter an integer: ");
		integer = userInput.nextInt();


			if (integer > largest){
			largest = integer;
			}
		else if (integer > secondLargest && integer != largest){
			secondLargest = integer;
			}
			counter+=1;
			}
	

			System.out.println(largest+","+secondLargest);

	}




}