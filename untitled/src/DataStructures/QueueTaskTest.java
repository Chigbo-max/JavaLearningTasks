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


}
