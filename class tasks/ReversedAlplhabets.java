
import java.util.Scanner;

	public class ReversedAlplhabets{

		public static void main(String... args){

		Scanner reversedLetters = new Scanner(System.in);

		System.out.print("Enter a string: ");

		String alphabets = reversedLetters.next();
	
		alphabets.reverse();
	
		System.out.println("The reversed string is:" + alphabets.toString());

    }



}

