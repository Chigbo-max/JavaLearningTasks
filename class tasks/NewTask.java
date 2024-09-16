public class NewTask{
	public static void main(String... args){
	int grandSum = 0;
	int squaredGrandSum = 0;

	for(int counter = 1; counter <= 10; counter++){
	int result = 1;
	int sum = 0;
	if(counter%4==0){
		for(int count = 1; count <= 5; count++){
			result = result*counter;
			sum = sum + result;
			 }
			grandSum = grandSum + sum;
			squaredGrandSum = grandSum * grandSum;

		   }
	     }

		System.out.print(squaredGrandSum + " ");


	}


}