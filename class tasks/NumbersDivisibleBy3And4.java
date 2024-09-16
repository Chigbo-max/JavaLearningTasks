public class NumbersDivisibleBy3And4{
	public static void main(String... args){

	int numbersPerLine = 10;

	int count = 0;

	for(int number = 100; number <= 1000; number++){

		if(number%3==0 || number%4==0){
		
			count++;
			
			    if(count % numbersPerLine == 0){
				
				System.out.println(number);
				 }
		
				else {
					System.out.print(number + " ");
				}
				    
			}	
								System.out.print(" ");
				
		}


	}



    }