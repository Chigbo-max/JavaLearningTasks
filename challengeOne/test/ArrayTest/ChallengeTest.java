package ArrayTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeTest {
    @Test
    public void addition(){
        int num = 3;
        int secondNum = 5;
        int numbers = Task.addNumbers(num,secondNum);
        int expected = 8;
        assertEquals(expected,numbers);
    }

}
