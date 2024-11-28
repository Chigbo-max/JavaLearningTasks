package InheritanceTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThingTest {
    @Test
    public void testNonsense(){
    Amphibian amph = new Amphibian();
    amph.move();
    amph.name("chigbo");
    }

}