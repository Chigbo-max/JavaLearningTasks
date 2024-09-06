import java.util.Scanner;

public class PrimeNumberMethod{

	public static void main(String... args){

		System.out.println(isPrime(10000));
		System.out.println(displayIsPrimeNumber(10000));
		System.out.println(primeCounter(10000));
		}



public static int primeCounter(int choiceNumber){
	
int factor = 0;
	int counter = 0;
	for(int count = 2; count<=choiceNumber; count+=2){

	//if(displayIsPrimeNumberisPrime(count)){
	//counter++;

	factor = isPrime(choiceNumber);
	if (factor == count){
	factor++;

	}

		
	}
	return factor;

	}


public static boolean displayIsPrimeNumber(int choiceNumber){
	int factorr = isPrime(choiceNumber);

	return factorr == 2 ? true : false;
	}

public static int isPrime(int number){
int counter = 0;
int count;
int factor = 0;
for(count = 1; count<number; count++){
if(number%count == 0)factor++;

	}
return factor;

}


}