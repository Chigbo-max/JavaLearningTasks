/*a, b, c = 2
d,e,f =3
ghi = 4
JKL = 5
mno
pqrs
tuv
wxyz
+ is an invalid input
*/

import java.util.*;

public class PhoneNumbers{

public static void main(String... args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a letter: ");

char userInput = Character.toLowerCase(input.next().charAt(0));

switch(userInput)
	{
	case 'a' : System.out.print(userInput + "" + 1);
	case 'b' : System.out.print(1); 
	case 'c' : System.out.print(1); 
	case 'd' : System.out.print(userInput + "" + 2);
	case 'e' : System.out.print(2); 
	case 'f' : System.out.print(2); break;
		}
	
	}


}