public class Exercise515{
	public static void main(String... args){
		for(int count = 1; count <= 10; count++){

			for(int counter = 1; counter <= count; counter++){

				System.out.print("*");

			}
				System.out.println();

			}

			System.out.println();

		for(int countee = 10; countee >= 1; countee--){
			for(int counterr = countee; counterr >= 1; counterr--){
		
				System.out.print("*");


			}

			System.out.println();

		
		}



		for(int count = 1; count <= 10; count++){

			for(int counter = 1; counter <= count; counter++){

				System.out.print(" ");

			}


		for(int counterr = 10; counterr >= count; counterr--){

				System.out.print("*");

			}

				System.out.println();

			}
	

		for(int countee = 10; countee >= 1; countee--){
			for(int counterr = countee; counterr >= 1; counterr--){
		
				System.out.print(" ");

				}
				for(int counterrr = 10; counterrr >= countee; counterrr--){
		
					System.out.print("*");

			}

			System.out.println();

		}







	}


}