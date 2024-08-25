import java.util.Scanner;

public class LargestAndSmallestDigits{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number or -1 to quit");
	int number = input.nextInt();

	int largest = number;
	int smallest= number;

	while(number!=-1){

	if(number>largest)
	largest = number;
	
	if(number<smallest)
	smallest = number;
	
	System.out.println("Enter a number or -1 to quit");
	number = input.nextInt();

	}

	System.out.println("The largest number is" + " " + largest);
	System.out.println("The smallest number is" + " " + smallest);


	}



}