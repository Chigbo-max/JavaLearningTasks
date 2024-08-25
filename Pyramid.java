import java.util.Scanner;

	public class Pyramid{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the estimated number of stones used: ");
	int numberOfStones = input.nextInt();

	System.out.print("Enter the average weight of each stone in tons: ");
	double averageWeight = input.nextDouble();
	
	System.out.print("Enter the number of years taken to build the pyramid: ");
	int numberOfYears = input.nextInt();

	double totalStoneSize = numberOfStones * averageWeight;

	double weightSizePerYear = totalStoneSize / numberOfYears;
	double weightSizePerHour = weightSizePerYear / (365 * 24);
	double weightSizePerMin = weightSizePerHour / 60;

	System.out.printf("%nThe estimate weight of the pyramind with respect to the number of stones used PER YEAR is %.0f tonnes%n%n", weightSizePerYear);

	System.out.printf("The estimate weight of the pyramind with respect to the number of stones used PER HOUR is %.0f tonnes%n%n", weightSizePerHour);

	System.out.printf("The estimate weight of the pyramind with respect to the number of stones used PER MINUTE is %.1f tonnes%n%n", weightSizePerMin);

	

	

	





	}



}