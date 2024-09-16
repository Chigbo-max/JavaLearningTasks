public class Interest{
		public static void main(String... args){
		double principal = 1000.0;
		double interestRate = 0.05;
		
		System.out.printf("Year\tAmount");

		for(int year = 1; year<=10; year++){
		double amount = principal*Math.pow(1.0 + interestRate,year);
		System.out.printf("\n%d\t%.1f\n", year, amount);

			}





}






}