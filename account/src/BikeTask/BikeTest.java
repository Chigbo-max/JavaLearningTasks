package BikeTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    Bike bike;

    @BeforeEach
    public void startEachTestWithThis() {
        bike = new Bike(true,0,0);
    }

    @Test
    public void checkIfBikeIsTurnedOnTest(){
        bike.turnOn();
        assertTrue(bike.isTurnedOn());
    }

    @Test
    public void checkIfBikeIsTurnedOffTest(){
        assertFalse(bike.isTurnedOn());
    }

    @Test
    public void checkIfBikeCanBeAcceleratedTest(){
        int currentSpeed = 44;
        bike.accelerate(currentSpeed);
        int expect = 48;
        assertEquals(expect, bike.getAccelerate());
    }

    @Test
    public void checkIfBikeCanBeDeceleratedTest(){
        int currentSpeed = 24;
        bike.decelerate(currentSpeed);
        int expect = 22;
        assertEquals(expect,bike.getAccelerate());
    }


}
