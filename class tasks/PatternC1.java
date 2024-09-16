import java.util.Scanner;

public class PatternC1{



public static void printStar(){
		System.out.print("* ");
	}

	public static void printSpace(){
		System.out.println( );
	}

	public static void upperTriangle(){
	for(int countt = 1; countt<=6; countt++){		
		for(int counte=1; counte<=countt; counte++){
		printStar();			
			}
		printSpace();
	      		}
		}

	public static void lowerTriangle(){
	for(int countt = 1; countt<=6; countt++){
	for(int counter=6; counter>=countt; counter--){
	printStar();
		}
	printSpace();
		}
	}
	
	public static void numberOfTimes(int userInput){
	
	for(int count = 0; count<=userInput-1; count++){
	upperTriangle();
	lowerTriangle();
	
	}

	}


	public static void main(String[] args){
	Scanner numberCollected = new Scanner(System.in);
	System.out.println("Enter preferred number");
	int userInput = numberCollected.nextInt();
	numberOfTimes(userInput);
	}




}