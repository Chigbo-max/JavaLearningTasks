import java.util.*;


public class CrapsGame{


public static void displayGame(){

	int wager = 0;
	int bankBalance = 1000;
	int sumOfDice = gameOfCraps();

	Scanner userInput = new Scanner(System.in);

	

while(wager > bankBalance || wager <= 0){
	System.out.println("Enter a wager: ");
	wager = userInput.nextInt();


	if(wager > 1000 || wager < 1){
		System.out.print("Oops, that's an invalid number, enter an amount between $1 and $1000");
	}else if(wager <= bankBalance) {

	sumOfDice = gameOfCraps();
	System.out.println("You're up big. Now's the time");
		}
	}

	if(sumOfDice == 7 || sumOfDice == 11){
		bankBalance+=wager;
		System.out.println("You win!\nNew bank balance: " + bankBalance);

	}else if(sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12){
		bankBalance-=wager;
		System.out.println("You lost!\nNew bank balance: " + bankBalance);
		System.out.println("Oh, you're going for broke, huh?");


	}
	if(bankBalance == 0){
		System.out.println("Sorry, you busted");
	
		
	}

}

public static int gameOfCraps(){

	int dice1 = 1 + (int) (6*Math.random());
	int dice2 = 1 + (int) (6*Math.random());
	int sum = dice1 + dice2;

if(sum == 2)
	System.out.println("computer rolled 2");
	System.out.println("Aw c'mon, take a chance!");


if(sum == 3)
	System.out.println("computer rolled 3");

if(sum == 12)
	System.out.println("computer rolled 12");

return sum;

		}
	

}