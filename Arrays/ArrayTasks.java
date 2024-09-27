import java.util.*;
	public class ArrayTasks{
		public static void main(String... args){
			Scanner userInput = new Scanner(System.in);

			System.out.print("Enter number of elements: ");
			int numberOfElements = userInput.nextInt();
			userInput.nextLine();

			System.out.print("Enter string: ");
			String str = userInput.nextLine();

			int[] numbers = new int[numberOfElements];


		for(int count = 0; count < numbers.length; count++){
		System.out.print("Enter number " + (count + 1));
		numbers[count] = userInput.nextInt();

		}


		displayTwoLists(str, numbers);
		
		}


		public static int displayLargest(int[] numbers){
			int largest = numbers[0];
			for(int count = 0; count < numbers.length; count++){
		
				if (numbers[count] > largest) largest = numbers[count];

		}
		System.out.print(largest);
		
		}



		public static int displayReverse(int[] numbers){
			int[] reverse = new int[numbers.length];

			for(int counter = 0; counter < numbers.length; counter++){
				reverse[counter] = numbers[numbers.length - 1 - counter];
		
		}

		for(int counter = 0; counter < numbers.length; counter++){

			System.out.print(reverse[counter]);

		}
		}


		public static int displayEvenPositions(int[] numbers){

			for(int count = 0; count < numbers.length; count++){
				if (count % 2 == 0) System.out.println(numbers[count]);

		}
		}

		
		public static int displayOddPositions(int[] numbers){

			for(int count = 0; count < numbers.length; count++){
				if (count % 2 != 0) System.out.println(numbers[count]);
		}
		}

		public static int checkElementOccurs(int[] numbers){
		
		Scanner userInput = new Scanner(System.in);
			System.out.print("Enter number to check if it occurs in the list: ");
		int check = userInput.nextInt();
			
			for(int count = 0; count < numbers.length; count++){
		
				if (numbers[count] == check){
		System.out.println("Number occurs in the list");
		}
		}
		System.out.println("This number is not in the list");
		}

		public static int displayRunningTotal(int[] numbers){
			int runningTotal = 0;
			for(int count = 0; count < numbers.length; count++){
		
				runningTotal += numbers[count];
				}
		System.out.println(runningTotal);
	
		}	



	public static String displayPalindrome(String str){

		char[] character = str.toCharArray();

		for(int count = 0; count < character.length/2; count++){
		character[count] = character[character.length - 1 - count];

		}

		String reverse = new String(character);
		if (str.equals(reverse)){
			System.out.print("string is a palindrome");
		}else{
			System.out.print("string is not a palindrome");
		     }
		return reverse;
	}

	//not working yet
	public static String[] displayTwoLists(String str, int[] numbers){

		char[] character = str.toCharArray();
		String num = Arrays.toString(numbers);

		int count;
		int counter;

		for(count = 0; count < character.length; count++){
		System.out.print(character[count]);
		}

		return num;

	}



}