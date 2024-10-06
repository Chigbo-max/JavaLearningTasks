
//Write a method to sort an array of strings based on their lengths (from shortest to longest).


import java.util.Scanner;
import java.util.Arrays;

public class StringsSorting{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);

		String string = scanner.nextLine();
		String[] array = string.split(" ");
			System.out.print(Arrays.toString(displaySortedStrings(array)));
		}

		public static String[] displaySortedStrings(String[] words){
			for(int i = 0; i < words.length; i++){
				for(int j = 1; j < words.length; j++){
					if (words[j].length() > words[j - 1].length()){
						String temp = words[j-1];
						words[j-1] = words[j];
						words[j] = temp;
						
					}

				}

			}
		return words;

		
	}


}