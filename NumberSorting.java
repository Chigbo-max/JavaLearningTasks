
import java.util.Scanner;
import java.util.Arrays;
public class Trial4{

	public static int[] displaySortedNumbers(int[] input){
	
		int[] digits = new int[input.length];
	
		int sumTotal = 0;
			for(int index = 0; index < input.length; index++){
				sumTotal = sumTotal + input[index];
				}
	
		int[] sortedNumbers = new int[input.length];
	
		for(int index = 0; index < sortedNumbers.length; index++){
			sortedNumbers[index] = sumTotal - input[index];
			}

		return sortedNumbers;
	}
	

	public static int displayLargest(int[] input){
	
		int largest = input[0];
		for(int index = 0; index < input.length; index++){
			if (input[index] > largest) largest = input[index]; 
				}
		return largest;
	}

	public static int displayLowest(int[] input){
	
		int lowest = input[0];
		for(int index = 0; index < input.length; index++){
			if (input[index] < lowest) lowest = input[index];
				}
		return lowest;
	}


	public static int[] displayLargestAndLowest(int[] input){
		int lowest = displayLowest(input);
		int largest = displayLargest(input);

	return new int[]{lowest,largest};

	}

	public static int[] getUserInput(){
	
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int numberOfElements = userInput.nextInt();

		int[] numbers = new int[numberOfElements];

		for(int index = 0; index < numberOfElements; index++){
			System.out.print("Enter number" + (index + 1) + ": ");
			numbers[index] = userInput.nextInt();
			}
		return numbers;
	}



	public static void main(String... args){

		int[] numbers = getUserInput();
	
		System.out.println(Arrays.toString(displaySortedNumbers(numbers)));	

	int[] highestAndLowest = displayLargestAndLowest(numbers);

		System.out.println("Lowest and largest = " + Arrays.toString(displayLargestAndLowest(displaySortedNumbers(numbers))));
		System.out.println("Numbers that produced the lowest and largest = " + Arrays.toString(highestAndLowest));	

	
	}


}



