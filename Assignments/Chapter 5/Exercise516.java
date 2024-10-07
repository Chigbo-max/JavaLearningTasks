import java.util.Scanner;
public class Exercise516{
	public static void main(String[] args){
	
	Scanner userInput = new Scanner(System.in);

	int number = 0;
	int count;
	
		for(int input = 1; input <= 5; input++){
		System.out.print("Enter a number: ");
		number = userInput.nextInt();
		}
			

		for(count = 1; count <= 30; count++){
			System.out.print(count);
		
			if(number == count) {
		for(int asteriks = 1; asteriks <= count; asteriks++){
			System.out.print(" *");
			
				}
				}
			System.out.println();

			
		}
	}

}