import java.util.Scanner;

	public class LargestAndSmallestNumbers{
	
	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter any number or enter -1 to quit: ");
	int number = input.nextInt();
	
	int largestNumber = 0;
	int smallestNumber = 0;

	if(number != -1){
	largestNumber = number;
	smallestNumber = number;
	}

	while(number!=-1){
		
	if(number>largestNumber){
	largestNumber = number;
	}
	if(number<smallestNumber){
	smallestNumber = number;
	}

	System.out.println("Enter any number or enter -1 to quit: ");
	number = input.nextInt();
	}

	System.out.println("Smallest number is" + " " + smallestNumber);
	System.out.println("Largest number is" + " " + largestNumber);
	
	}

}