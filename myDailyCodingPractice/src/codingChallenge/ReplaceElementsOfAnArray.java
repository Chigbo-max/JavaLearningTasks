package codingChallenge;

public class ReplaceElementsOfAnArray {
    public static int[] replaceElementsOfAnArray(int[] numbers) {
        for(int index = 0; index < numbers.length; index++) {
         if(numbers[index] % 2 == 0) {
             numbers[index] = 0;
         }else{
               numbers[index] = 1;
               //numbers[index] = numbers[index] % 2;
             }
         }

        return numbers;
    }
}
