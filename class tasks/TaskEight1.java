public class TaskEight1{
	public static void main(String... args){
		for(int counter = 1; counter <=10; counter+=1){
		int totalSum = 0; 
		int result = 1;
		if(counter%4==0){
	
		for(int number = 1; number<=5; number+=1){
			result = result*counter;
			totalSum = totalSum + result;	
			}
			
			
			System.out.print(totalSum);
			}				
			
			System.out.print(" ");		

		}
	
	
	
   
	}
}