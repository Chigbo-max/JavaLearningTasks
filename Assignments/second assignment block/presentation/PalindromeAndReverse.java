import java.util.*;

	public class PalindromeAndReverse{

		public static void main(String... args){
			Scanner userInput  = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = userInput.nextInt();

			System.out.print("Enter same number as above: ");
			int choice = userInput.nextInt();

			numberOfPrimeAndPalindrome(choice);
}



public static boolean palindrome(int number){

int reverse1 = reverse(number);

if (reverse1 == number){
	return true;
}else{

	return false;
	}
}

public static int reverse(int number){

int reverse = 0;

while(number!=0){

reverse = (reverse * 10) + (number%10);
number = number/10;
}


return reverse;

}


public static int factor(int number){

int factor = 0;

for(int count = 1; count<=number; count++){
if(number%count == 0) factor++;
	}
return factor;
}



public static boolean prime(int number){

int factor1 = factor(number);

if(factor1 == 2){
return true;

}else{

return false;
}
}

public static void primeAndPalindrome(int number){


if(prime(number) && palindrome(number)){
	System.out.println("number is both a palindrom and a prime number");

}else if(prime(number) && !palindrome(number)){
	System.out.println("number is a prime number but not a palindrome number");

}else if(!prime(number) && palindrome(number)){
	System.out.println("number is not a prime number but a palindrome number");

}else
	System.out.println("number is both not a palindrome and a prime number");

	
}


public static void numberOfPrimeAndPalindrome(int choice){

	int counter = 0;

	for(int number = 1; number <= choice; number++){
		
		if(prime(number) && palindrome(number)){
		System.out.printf(" %3d ", number);
		counter++;


		if(counter % 10 == 0){
		System.out.println("");	
		}
		
		}
	 }
	
		
}



}