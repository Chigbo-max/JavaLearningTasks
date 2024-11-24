package codingChallenge;
import java.util.Arrays;

public class ArrayChallengeTask1 {

    public static int[] doubleArray(int[] numbers) {
        int[] newArray = new int[(numbers.length) * 2];
        for (int index = 0; index < numbers.length; index++) {
            newArray[index] = numbers[index];
            newArray[index + numbers.length] = numbers[index] * 2;
        }
        return newArray;
    }


    public static int[] combinedArray(int[] firstArray) {
        int[] resultArray = new int [(firstArray.length)*2];
        int[] secondArray = {6,7,8,9,10};
        int count = 1;
        for(int index = 0; index < firstArray.length; index++){
           resultArray[count - 1] = firstArray[index];
           resultArray[count] = secondArray[index];
           count+=2;
        }


        System.out.print(Arrays.toString(resultArray));




        return resultArray;

    }


    }


