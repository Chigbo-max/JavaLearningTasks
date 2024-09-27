import java.util.Scanner;

public class ArrayList{

	public static void main(String... args){
	Scanner userInput = new Scanner(System.in);
	int [] ages = new int[10];


	for(int i = 0; i < 10; i++){
	System.out.print("Enter a number ");
	ages [i] = userInput.nextInt();
	}
	System.out.printf("%s%12s%n","Index","Ages");

	for(int i = 0; i < 10; i++){
	System.out.printf("%d%14d%n",i,ages[i]);
	
		}

	for(int i = 0; i < 10; i++){
	System.out.printf("%3d%c",ages[i], ',');
		}



	}



}