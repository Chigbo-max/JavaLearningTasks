// Write a function that removes duplicates from a sorted array in place and returns the new length of the array.


import java.util.Arrays;

public class DuplicateRemoval{
	public static void main(String... args){
		int[] array = {1,4,4,4,1,1,3,2,2,2,3,3,5,5,5};
		int results = removeDuplicates(array);

		for(int count = 0; count < results; count++){
			System.out.print(array[count] + " ");
			}
		System.out.println("The new length is: " + results);

	}

	public static int[] sortDuplicates(int[] array){
		if(array.length == 0) return new int[0];
		
		for(int index = 0; index < array.length; index++){
			for(int checker = 1; checker < array.length; checker++){
				if(array[checker] < array[checker - 1]){
					int temp = array[checker - 1];
					array[checker - 1] = array[checker];
					array[checker] = temp;

					}
				}
			}
		
			return array;

		}



	public static int removeDuplicates(int[] array){
		int[] duplicates = sortDuplicates(array);
		
		int count = 0;

		for(int index = 1; index < duplicates.length; index++){	
			if(duplicates[index] != duplicates[count]){
				count++;
			duplicates[count] = duplicates[index];

			}

		}
		return count + 1;

	}



}