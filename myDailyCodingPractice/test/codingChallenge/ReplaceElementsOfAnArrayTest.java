package codingChallenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ReplaceElementsOfAnArrayTest {
    @Test
    public void replaceElementsOfAnArray(){
        int[] numbers = {4,5,8,8,2,9};
        ReplaceElementsOfAnArray.replaceElementsOfAnArray(numbers);
        int[] expected = {0,1,0,0,0,1};
        assertArrayEquals(expected,numbers);
    }
}
