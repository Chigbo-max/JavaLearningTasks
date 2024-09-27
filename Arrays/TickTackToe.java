import java.util.Scanner;

	
public class TickTackToe{

	public static void main(String... args){

		Scanner userInput = new Scanner(System.in);

		String[][] tickTackToe = new String[3][3];
		
		//{{'X','O','X'},{'O','O','O'},{'X','O','X'}};


		int i;
		int j;

		for(i = 0; i < tickTackToe.length; i++){

			for(j = 0; j < tickTackToe.length; j++){
		String character = userInput.nextLine();

		System.out.print(tickTackToe[i][j] = character + " ");

			}
		System.out.println();

		}

	}


}