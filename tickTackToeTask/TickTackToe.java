import java.util.Scanner;

public class TickTackToe{

	private String playerOne;
	private String playerTwo;

	public static void main(String... args){

		Scanner userInput = new Scanner(System.in);

		char[][] tickTackToeGame = {{'1','2', '3'}, {'4','5','6'}, {'7','8','9'}};


		TickTackToe tickTackToe = new TickTackToe();
		Scanner name = tickTackToe.getPlayerName();

		tickTackToe.makeSelection(tickTackToeGame);

		}






		public static void printBoard(char[][] board){


		for(int row = 0; row < board.length; row++){
			
			for(int column = 0; column < board[row].length; column++){
		
			System.out.print("[" + board[row][column] + "]" + " ");
				}
			System.out.println();
			}

		}




		public Scanner getPlayerName(){

			Scanner userInput = new Scanner(System.in);

			System.out.print("Enter name for player one: ");
			this.playerOne = userInput.nextLine();

			System.out.print("Enter name for player two: ");
			this.playerTwo = userInput.nextLine();

			return userInput;
			}




		public void makeSelection(char[][] game){


		printBoard(game);
		boolean isValidMove = false;

		Scanner userInput = new Scanner(System.in);



		while(true){

			if(!isValidMove){

		
				System.out.print(this.playerOne +"'s turn (X): ");
				System.out.print("Choose a number: ");
				char firstPlayer = userInput.next().charAt(0);

			takeBoardInputs(game, firstPlayer, 'X');

			if(isBoardFull(game)){
				System.out.print("Its a draw!");
				break;
				}
			
			else if(isWin(game)){System.out.print(this.playerOne + " wins"); break;}

			}
			


			if(!isValidMove){
			
			System.out.print(this.playerTwo +"'s turn (O): ");
			System.out.print("Choose a number: ");
			char secondPlayer = userInput.next().charAt(0);

			takeBoardInputs(game, secondPlayer, 'O');
			if(isBoardFull(game)){
				System.out.print("Its a draw!");
				break;
				}
			else if(isWin(game)){System.out.print(this.playerTwo + " wins"); break;}
				}

			}

		}
			

			public static boolean takeBoardInputs(char[][] board, char playerChoice, char symbol){
				
		
				for(int index = 0; index < board.length; index++){

					for(int column = 0; column <board[index].length; column++){
						if(playerChoice == board[index][column]){

							if(board[index][column] == 'O' || board[index][column] == 'X'){
								System.out.println("Wrong move, slot taken already");
								return true;
								}
						board[index][column] = symbol;
				
							}

						}

					}
			
				printBoard(board);

				return false;

				}


		public static boolean isBoardFull(char[][] board){

			for(int row = 0; row < board.length; row++){

				for(int column = 0; column <board[row].length; column++){
					if(board[row][column] != 'X' && board[row][column] != 'O'){
						return false;
						}
					}
				}

			return true;
		}



		
		


		public static void isValid(Scanner input){
		

		}

		public static boolean isWin(char[][] board){

			for(int row = 0; row < board.length; row++){
				for(int column = 0; column < board[row].length; column++){
				
				if(board[0][0] == board[0][1] && board[0][0] == board[0][2]){return true;} 
				if(board[0][0] == board[1][0] && board[0][0] == board[2][0]){return true;}
				if(board[0][0] == board[1][1] && board[0][0] == board[2][2]){return true;}
				if(board[1][0] == board[1][1] && board[1][0] == board[1][2]){return true;}
				if(board[2][0] == board[2][1] && board[2][0] == board[2][2]){return true;}
				if(board[2][0] == board[1][1] && board[2][0] == board[0][2]){return true;}
				if(board[0][2] == board[1][2] && board[0][2] == board[2][2]){return true;}
				if(board[0][1] == board[1][1] && board[0][1] == board[2][1]){return true;}



				}

			}
		return false;
		}


}