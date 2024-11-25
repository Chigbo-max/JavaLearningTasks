package DataStructures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTaskTest {

    Queues queue;

    @BeforeEach
    public void startEachTestWithThis() {
        queue = new Queues(3);
    }

    @Test
    public void testThatFunctionEnqueuesElementsToAQueue() {
        assertFalse(queue.isEmpty());
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(8);
        assertEquals(3, queue.getQueue().length);
    }

    @Test
    public void testThatFunctionDequeuesElementsFromAQueue() {
        assertFalse(queue.isEmpty());
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(8);
        assertEquals(3, queue.getQueue().length);
        queue.dequeue();
        queue.dequeue();
        int expected = 5;
        assertEquals(expected, queue.getValue());
    }

    @Test
    public void testThatFunctionDisplaysMostRecentDequeuedElement() {
        assertFalse(queue.isEmpty());
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(8);
        assertEquals(3, queue.getQueue().length);
        queue.dequeue();
        int expected = 2;
        assertEquals(expected, queue.getValue());

    }

    @Test
    public void testThatAnExeptionIsThrownWhenQueueIsFull(){
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(8);
        assertThrows(IllegalArgumentException.class, ()->{queue.enqueue(22);});
    }



}
