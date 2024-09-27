import java.util.*;
	public class SumOfNumbers{
		public static void main(String... args){
			Scanner userInput = new Scanner(System.in);

			System.out.print("Enter number of elements: ");
			int numberOfElements = userInput.nextInt();

			int[] numbers = new int[numberOfElements];

		System.out.print("Sum is " + displaySum1(numbers));
		System.out.print("Sum is " + displaySum2(numbers));
		System.out.print("Sum is " + displaySum3(numbers));

	}

	public static String displayPalindrome(String str){

		char[] ch = str.toCharArray();

		for(int i = 0; i < ch.length/2; i++){
		ch[i] = ch[ch.length - 1 - i];

		}

		String reverse = new String(ch);
		if (str.equals(reverse)){
			System.out.print("string is a palindrome");
		}else{
			System.out.print("string is not a palindrome");}
		return reverse;
	}


	public static int displaySum1(int[] number){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		for(int count = 0; count < number.length; count++){
		System.out.println("Enter number " + (count + 1));
		number[count] = input.nextInt();
		sum += number[count];
		}

		return sum;
	}


	public static int displaySum2(int[] number){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		while(count < number.length){
		System.out.println("\nEnter number " + (count + 1));
		number[count] = input.nextInt();
		sum += number[count];
		count++;
		}

		return sum;
	}


	public static int displaySum3(int[] number){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		do{
		System.out.println("\nEnter number " + (count + 1));
		number[count] = input.nextInt();
		sum += number[count];
		count++;
		}

		while(count < number.length);
		return sum;
	}



}
