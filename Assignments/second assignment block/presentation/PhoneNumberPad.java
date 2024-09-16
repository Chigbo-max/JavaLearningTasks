
import java.util.*;

public class PhoneNumberPad{


public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a letter: ");

String letter = input.nextLine().toLowerCase();

for(int count = 0; count < letter.length(); count++){

	char character = letter.charAt(count);
	
	if(Character.isLetter(character))
		System.out.print(getNumber(character));
	else
		System.out.print(character);
	
	}
}

public static int getNumber(char letter){


switch(letter)
	{
	case 'a' : case 'b' : case 'c' : return 2;
	case 'd' : case 'e' : case 'f' : return 3;
	case 'g' : case 'h' : case 'i' : return 4;
	case 'j' : case 'k' : case 'l' : return 5;
	case 'm' : case 'n' : case 'o' : return 6;
	case 'p' : case 'q' : case 'r' : case 's' : return 7;
	case 't' : case 'u' : case 'v' : return 8;
	case 'x' : case 'w' : case 'y' : case 'z' : return 9;
	default: System.out.print(-1); break;
		}
	return letter;
	}


}