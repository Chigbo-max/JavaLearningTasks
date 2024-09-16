import java.util.*;

public class CountLetters{

	public static void main(String... args){

	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter a string: ");
	String letters = userInput.next();
	countLetters(letters);

	}

public static int countLetters(String input){
	
	int count = input.length();

	System.out.println(s + " " + "has" + " " +  count + " " + "letters");
	
	return count;

}








}