package codingChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayChallengeTask1Test {
    @Test
    public void doubleLengthOfAnArrayTest(){
        int[] numbers = {4,5,8};
       numbers = ArrayChallengeTask1.doubleArray(numbers);
        int[] expected = {4,5,8,8,10,16};
        assertArrayEquals(expected, numbers);
    }
    @Test
    public void combinedNumbers(){
        int[] numbers = {1,2,3,4,5};
        numbers = ArrayChallengeTask1.combinedArray(numbers);
        int[] expected = {1,6,2,7,3,8,4,9,5,10};
        assertArrayEquals(expected,numbers);
    }



}
