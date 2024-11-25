package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTaskTest {


    Stacks stack;

    @BeforeEach
    public void startEachTestWithThis() {
        stack = new Stacks(3);
    }


    @Test
    public void testThatStackPushesElementsToStack() {
        assertFalse(stack.isEmpty());
        stack.push(5);
        stack.push(12);
        stack.push(20);
        int[] expect = {5,12,20};
        assertArrayEquals(expect, stack.getStack());
    }

    @Test
    public void testThatStackPopElementsFromStack() {
        assertFalse(stack.isEmpty());
        stack.push(5);
        stack.push(12);
        stack.push(20);
        int[] expect = {5,12,20};
        assertArrayEquals(stack.getPush(), expect);
        stack.pop();
        stack.pop();
        int expect2 = 12;
        assertEquals(expect2, stack.getValue());

    }

    @Test
    public void testThatStackDisplayTheMostRecentPushed() {
        assertFalse(stack.isEmpty());
        stack.push(5);
        stack.push(12);
        stack.push(20);
        int[] expect = {5,12,20};
        assertArrayEquals(stack.getPush(), expect);
        stack.peek();
        int expect2 = 20;
        assertEquals(expect2, stack.getValue());
    }

    @Test
    public void testThatFunctionThrowsErrorWhenStackIsFull(){
        stack.push(5);
        stack.push(12);
        stack.push(20);
        assertThrows(IllegalArgumentException.class, () -> {stack.push(25);});

    }



}
