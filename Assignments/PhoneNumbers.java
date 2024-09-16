


import java.util.*;

public class PhoneNumbers{


public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a letter: ");
char userInput = Character.toLowerCase(input.next().charAt(0));
System.out.print(character(userInput));

}


public static int character(char letter){


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



		}
	return letter;
	}


}



