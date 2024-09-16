import java.util.Scanner;

	public class CountOfPositiveNegativeAndZeros1{

	public static void main(String... args){
	
	Scanner numbersEntered = new Scanner(System.in);
	
	int positiveNumbers=0;
	int negativeNumbers=0;
	int zeros = 0;
	int numbersCounter = 0;

	System.out.println("Enter a number or 500 to quit: ");
	int number = numbersEntered.nextInt();
	
	while(number!=500){
	System.out.println("Enter a number or 500 to quit: ");
	
	number = numbersEntered.nextInt();
 
	if(number>0){
	positiveNumbers = positiveNumbers + 1;
	}
	if(number<0){
	negativeNumbers = negativeNumbers + 1;
	}
	if(number==0){
	zeros = zeros +1;
	}

	numbersCounter = numbersCounter + 1;

	
	}

	System.out.println("Count of positive numbers: " + 	positiveNumbers);
	System.out.println("Count of negative numbers: " 	+negativeNumbers);
	System.out.println("Count of zeros: " + zeros);





		

	}


}