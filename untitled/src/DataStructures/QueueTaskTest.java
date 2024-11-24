package DataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTaskTest {

    @Test
    public void testThatFunctionEnqueuesElementsToAQueue() {
        Queues queue = new Queues(3);
        assertFalse(queue.isEmpty());
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(8);
        assertEquals(3, queue.getQueue().length);
    }

    @Test
    public void testThatFunctionDequeuesElementsFromAQueue() {
        Queues queue = new Queues(3);
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
        Queues queue = new Queues(3);
        assertFalse(queue.isEmpty());
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(8);
        assertEquals(3, queue.getQueue().length);
        queue.dequeue();
        int expected = 2;
        assertEquals(expected, queue.getValue());

    }



}
