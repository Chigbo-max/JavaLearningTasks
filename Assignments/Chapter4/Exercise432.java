
import java.util.Scanner;
public class Exercise432{
	public static void main(String... args){

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
			int number = userInput.nextInt();
			
			int first = (number % 10) * 1;
			int first_whole = number / 10;
			int second = (first_whole % 10) * 2;
			int second_whole = first_whole / 10;
			int third = (second_whole % 10) * 4;
			int third_whole = second_whole / 10;
			int fourth = (third_whole % 10) * 8;
			int fourth_whole = (third_whole / 10);
			int fifth = (fourth_whole % 10) * 16;

			System.out.print(first + second + third + fourth + fifth);

		}

	}


