/*
PSEUDO CODE
1. prompt user to enter Celsius degree from the console
2. convert it to Fahrenheit
3. display the result
*/

import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter celsius: ");

		double celsius =  userInput.nextDouble();
		

		double fahrenheit = ((9 * celsius)/5) + 32;

		System.out.println("Fahrenheit = " + " " + fahrenheit);

	}

}