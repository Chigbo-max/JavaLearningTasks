import java.util.Scanner;
	public class Exercise430{
		public static void main(String... args){
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = userInput.nextInt();
		
			for(int counter = 1; counter <= number; counter++){
				for(int count = 1; count <= counter; count++){
					System.out.print("*");
			}
					System.out.println();
		}
	}
}