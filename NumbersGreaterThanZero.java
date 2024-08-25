public class NumbersGreaterThanZero{
	public static void main(String... args){
	
	int number;
	number = 1;

	while(number<1_000_000){
	System.out.print(number + " ");
	number = number+10;
	if (number==500_001) break;
	}
	}
}