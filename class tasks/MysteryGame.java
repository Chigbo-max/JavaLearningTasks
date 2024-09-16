import java.util.Scanner;

public class MysteryGame{



	public static void main(String... args){
	displayGuessedNumber();

		}

	
	public static void displayGuessedNumber(){
	Scanner userInput = new Scanner(System.in);
	int randomNumber = guessedRandomNumber();

	int guessedNumber;
	int guessAttempt = 0;

	do{

	System.out.println("Guess a number: ");
	guessedNumber = userInput.nextInt();
	guessAttempt+=1;

	if(guessedNumber == randomNumber){
	System.out.println("you're correct");
	System.out.print("Number of times tried: " + guessAttempt);
	break;
	}
	if (guessedNumber > randomNumber)
	System.out.println("sorry, too high");

	
	if(guessedNumber < randomNumber)
	System.out.println("sorry, too low");

	if (guessAttempt % 3 == 0)
	randomNumber = guessedRandomNumber();

	if(guessAttempt == 10){
	System.out.println("sorry, you've had 10 failed attempts, try again");
	break;
	}

	}while (guessedNumber!=randomNumber);
	
	}
	public static int guessedRandomNumber(){
	System.out.println("\nGenerating new numbers");
	int randomNumber = (int) (11*Math.random());
	return randomNumber;
	}





}