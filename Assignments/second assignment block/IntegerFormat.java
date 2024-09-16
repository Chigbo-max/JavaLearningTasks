/*public static String format(int number, int width)


returns a string for the number with one or more prefix 0s

the size of the string is the width

format(34, 4) returns 0034, 

format(34, 5) returns 00034

if the number is longer than the width, the methods returns the string representation for the number. 
format(34, 1) returns 34
*/


import java.util.Scanner;

public class IntegerFormat{

public static void main(String... args){

Scanner userInput = new Scanner(System.in);
System.out.println("Enter a long integer: ");
int number = userInput.nextInt();

System.out.println("Enter a long integer: ");
int width = userInput.nextInt();

int zero = 0;

for(int i=0; i < width; i++){
zero += 0;
}

System.out.print(zero + number);



	}

}