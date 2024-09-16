import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumber{
	public static void main(String... args){
	
	SecureRandom randomNumbers = new SecureRandom();
	Scanner input = new Scanner(System.in);
	
	int random = randomNumbers.nextInt(10);

	int count =  0;
	
	while(count < 3){
	count++;

	System.out.print("Enter a number");

	int guessedNumber = input.nextInt();

	if(guessedNumber<random){
	System.out.println("sorry, too low");
	}
	else{
	if (guessedNumber>random)
	System.out.println("sorry, too high");
	}
	
	if (guessedNumber==random){
	System.out.println("you're correct");
	System.out.print("Number of times tried: " + count);
	break;
			}
	if (count == count*3) {
	random = count;
	System.out.println("You've had three failed attempts, please try again");
	break;
	}
	}
		
	
}

}