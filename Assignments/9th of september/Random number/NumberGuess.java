
import java.util.Scanner;

public class NumberGuess{

public static void displayRandomNumber(){
	

	int randomNumber = guessedNumber();
	int guess = 0;
	int count = 0;

	while(randomNumber != guess){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Guess a number berween 1 and 1000: ");
	count++;

	guess = userInput.nextInt();
	
	if(guess > randomNumber){
	System.out.print("Too high, try again\n");
	randomNumber = guessedNumber();

	}
	else if(guess < randomNumber){
	System.out.print("Too low, try again\n");
	randomNumber = guessedNumber();
	}
	else if(guess == randomNumber){
	System.out.print("Congratulations. You guessed the number!\n");
	System.out.print("Please play again");
	}

	}
	

}


public static int guessedNumber(){
System.out.println("\nGenerating a number");
int randomNumber = (int) (1000*Math.random());
return randomNumber;
	}



}