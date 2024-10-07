public class Exercise514{
	public static void main(String... args){
		double principal = 1000;
		
		System.out.printf("%s%20s", "Year", "Amount on deposit");
		
			for(int year = 1; year <= 10; year++){

				for(double rate = 0.05; rate <= 0.1; rate+=0.01){
			
					double amount = principal * Math.pow(1.0 + rate, year);

					System.out.printf("%n%d%20.2f", year, amount);	
					}
				

				System.out.println();
			}

		}


}