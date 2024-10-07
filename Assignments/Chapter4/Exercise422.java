public class Exercise422{
	public static void main(String... args){
		System.out.printf("%10s%10s%10s%10s%n","N","N2","N3","N4");
		

		double result;
		for(int count = 1; count <= 5; count++){		
		
			for(int power = 1; power <= 4; power++){		
				result = Math.pow(count, power);
				System.out.printf("%10d", (int)result);
			}
					System.out.println();

		}

	}



}