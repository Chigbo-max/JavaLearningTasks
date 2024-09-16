public class PatternInverseTriangle{
	public static void main(String[] args){
					
	for(int count = 1; count<=6; count++){	
		
		for(int counter=1; counter<=count; counter++){
                System.out.print(" ");
	       }

		for(int counte=count; counte<6; counte++){
		System.out.print("*");
		}

		for(int counte=count; counte<=6; counte++){
		System.out.print("*");
		}

			System.out.println();
		}		
			 
    }

 }
