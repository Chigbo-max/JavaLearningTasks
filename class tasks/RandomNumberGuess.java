import java.util.Scanner;

public class RandomNumberGuess{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
			
			int count = 1;

			while(count<=1){
			System.out.println("Guess a number:");
			int guessedNumber = input.nextInt();
		
			   if(guessedNumber<19){
			   System.out.println("Too low, try again");
				}
			      else if(guessedNumber>20){
			      System.out.println("Too high, try again!");
				}
			 if(guessedNumber==20){
			System.out.println("correct, you guessed right!");
			count++;

			}	
			}
			System.out.print(" ");






	}







}