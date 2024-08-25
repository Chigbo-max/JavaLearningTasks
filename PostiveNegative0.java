import java.util.Scanner;

public class PostiveNegative0{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter any number or 500 to quit");
	int number = input.nextInt();
	
	int positiveNumbers = 0;
	int negativeNumbers =0;
	int zeros = 0;
	
	while(number!=500){
	
	if(number>0)
	positiveNumbers++;
	
	if(number<0)
	negativeNumbers++;
	
	if(number==0)
	zeros++;	
	
	
	System.out.println("Enter any number or 500 to quit");
	number = input.nextInt();
	}

	System.out.println("The count of positive numbers is:"+ " " + 	positiveNumbers);
	System.out.println("The count of negative numbers is:"+ " " + 	negativeNumbers);
	System.out.println("The count of zeros is:"+ " " + 	zeros);
	








	}









}