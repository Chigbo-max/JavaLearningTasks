//Create a method to find and return duplicate elements in an array. 


import java.util.Arrays;

public class DuplicateElements{
	public static void main(String... args){
		int[] array = {1, 4, 4, 6, 7, 7,8};

		int index;
		int checker;

		for(index = 0; index < array.length - 1; index++){

			for(checker = index + 1; checker < array.length; checker++){
				if(array[index] == array[checker]){
					System.out.println(array[checker]);

				}

			}

			
		}

			
	}


}

