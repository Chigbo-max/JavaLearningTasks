import java.util.*;
public class BeautifiedString{
	public static void main(String... args){
		beautifyString();
			}


public static void beautifyString(){

	Scanner userInput = new Scanner(System.in);
		
	System.out.print("Enter string: ");
	String letter = userInput.nextLine();
		

	char character = letter.charAt(0);
	if(!Character.isUpperCase(character))

	character = Character.toUpperCase(character);
	System.out.print(character + letter.substring(1));

	if(!letter.endsWith(".")){
	System.out.print(".");
		}

		
	}
		







}