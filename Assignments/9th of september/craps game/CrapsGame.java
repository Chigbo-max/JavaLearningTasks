/*game of craps

int bankBalance = 1000 dollars
prompt user to enter a wager(money staked for the outcome of an event)
check if wager is less than or equal to bank balance, else reenter wager until valid wager is entered.

>>> run one game of craps
if player wins, increase bankBalance by wager and display the new bankBalance
if the player loses, decrease bankBalance by wager, display the new bankBalance
if the bankBlance has become zero, display the message "sorry. you busted!"

*/


import java.util.*;


public class CrapsGame{

	public static void main(String... args){
		displayGame();
		
	}

public static void displayGame(){

	int wager = 0;
	int bankBalance = 1000;
	int sumOfDice = gameOfCraps();

	Scanner userInput = new Scanner(System.in);

	

while(wager > bankBalance || wager <= 0){
	System.out.print("Enter a wager: ");
	wager = userInput.nextInt();


	if(wager > 1000 || wager < 1){
		System.out.print("Oops, that's an invalid number, enter an amount between $1 and $1000");
	}else if(wager <= bankBalance) {

	sumOfDice = gameOfCraps();
	System.out.print("You're up big. Now's the time");
}
	}

	if(sumOfDice == 7 || sumOfDice == 11){
		bankBalance+=wager;
		System.out.print("You win!\nNew bank balance: " + bankBalance);

	}else if(sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12){
		bankBalance-=wager;
		System.out.print("You lost!\nNew bank balance: " + bankBalance);
		System.out.print("Oh, you're going for broke, huh?");


	}
	if(bankBalance == 0){
		System.out.print("Sorry, you busted");
	
		
	}

}

public static int gameOfCraps(){

	int dice1 = 1 + (int) (6*Math.random());
	int dice2 = 1 + (int) (6*Math.random());
	int sum = dice1 + dice2;

if(sum == 2)
	System.out.print("computer rolled 2");
	System.out.print("Aw c'mon, take a chance!");


if(sum == 3)
	System.out.print("computer rolled 3");

if(sum == 12)
	System.out.print("computer rolled 12");

return sum;

		}
	

}