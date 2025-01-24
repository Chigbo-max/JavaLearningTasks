import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SpecialistTest {

    @Test
    public void testThatSpecialistIsFound(){
        String specialist = "General Doctor";
        String expected = "General Doctor";
        assertEquals(Specialists.findSpecialist(specialist), expected);
    }

    @Test
    public void testThatExceptionIsThrownIfSpecialistIsNotFound(){
        String specialist = "General Doc";
        assertThrows(IllegalArgumentException.class, () -> Specialists.findSpecialist(specialist));
        System.out.println(Specialists.displaySpecialists());
    }
}
