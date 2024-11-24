package ArrayChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckTest {
    @Test
    public void quick() {
        int number = 5;
        int second = 3;
        int numbers = Quick.sort(number, second);
        int expected = 8;
        assertEquals(expected,numbers);

    }
}


