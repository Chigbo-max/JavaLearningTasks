public class PatternTriangle{
	public static void main(String[] args){
					
	for(int count = 1; count<=6; count++){	
		
		for(int counter=count; counter<=6; counter++){
                System.out.print(" ");
	       }

		for(int counte=1; counte< count; counte++){
		System.out.print("*");
		}

		for(int counte=1; counte<=count; counte++){
		System.out.print("*");
		}

			System.out.println();
		}		
			 
    }

 }