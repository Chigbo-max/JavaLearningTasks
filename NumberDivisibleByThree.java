import java.util.Scanner;

	public class NumberDivisibleByThree{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter any number: ");
	
	int anyNumber = input.nextInt();

	 if (anyNumber%3==0){
	System.out.print("TRUE");
	}
	else{
	System.out.print("FALSE");
	}
}
}

