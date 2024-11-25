package EnumsTask;

import org.junit.jupiter.api.Test;

import static EnumsTask.GeoPoliticalZones.findState;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class GeoPoliticalZonesTest {
    @Test
    public void testThatFunctionReturnsThePoliticalZone() {
        String state = "Benue";
        String expected = "NORTH_CENTRAL";
        assertEquals(GeoPoliticalZones.findState(state), expected);

        String state1 = "Kaduna";
        String expected1 = "NORTH_WEST";
        assertEquals(GeoPoliticalZones.findState(state1),  expected1);

    }

    @Test
    public void testThatAnExeptionIsThrowWhenStateIsNotFound() {
        String state = "Benuu";
        assertThrows(IllegalArgumentException.class, () -> GeoPoliticalZones.findState(state));
    }

}

