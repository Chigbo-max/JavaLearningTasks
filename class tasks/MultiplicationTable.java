import java.util.Scanner;

public class TimesTable{
	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	double number = userInput.nextDouble();
	
	double result = 1;
	for(int counter = 1; counter <10; counter++){
	if(number % counter == 0);
	result = counter * number;
	System.out.println(number + " x " + counter + " " + "= " + result);
	}
	

}

}