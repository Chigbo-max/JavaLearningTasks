package codingChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyDailyCodingChallengesTest{
    @Test
    public void quickSortTest(){
        int[] numbers = {9,2,1,7,4};
        int start = 0;
        int end = numbers.length - 1;
        MyDailyCodingChallenges.quickSort(numbers, start, end);
        //check
        int[] expected = {1,2,4,7,9};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void findMaximumProductTest(){
        int[] numbers = {9,2,1,7,4};
        numbers = MyDailyCodingChallenges.findMaximumProduct(numbers);
        int[] expected = {7, 9};
        assertArrayEquals(expected, numbers);


    }

}
