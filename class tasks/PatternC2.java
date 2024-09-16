import java.util.Scanner;

public class PatternC2{



	public static void printStar(){
		System.out.print("* ");
	}

	public static void printSpace(){
		System.out.println( );
	}

	public static void triangle(int userInput){
	for(int count = 0; count<=userInput-1; count++){		
		for(int countt = 1; countt<=count; countt++){
		printStar();			
			}
		printSpace();
	      		}
	for(int count = 1; count<=userInput; count++){
	for(int counter=userInput; counter>=count; counter--){
	printStar();
		}
	printSpace();
		}
	}


	public static void main(String[] args){
	Scanner numberCollected = new Scanner(System.in);
	System.out.println("Enter preferred number");
	int userInput = numberCollected.nextInt();
	triangle(userInput);
	}

}