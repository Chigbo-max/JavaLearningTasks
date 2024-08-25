public class numbersInAPyramidPattern{
	public static void main(String... args){
	
	int counter = 1;
	int countt = 1;
	int count = 1;


	for(int num = 1; num<=7; num++){
		count = count * 3; 

		for(int number = 1; number<=7; number++){
		System.out.print(" ");

		}
			
		for(int number = 1; number<=num; number++){

			System.out.print(count + " ");
			}

		System.out.println(counter + " ");

		}


	}



}