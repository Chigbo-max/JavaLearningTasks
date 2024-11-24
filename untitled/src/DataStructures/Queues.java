package DataStructures;

public class Queues {

    private int size;
    private int[] queue;
    int count;
    int value = 0;

    public Queues(int size) {
        this.size = size;
        this.queue = new int[size];
        this.count = 0;
    }

    public boolean isEmpty() {
        if(this.size == 0){
            return true;
        }
        return false;
    }


    public int enqueue(int number) {
        return this.queue[this.count++] = number;
    }

    public int[] getQueue(){
        return this.queue;
    }

    public int dequeue() {

        int front = 0;
        value = this.queue[front];
        for(int index = 0; index < size - 1; index++) {
            this.queue[index] = this.queue[index + 1];
        }
        size--;

        return value;
    }

    public int getValue() {
        return value;
    }

    public int front() {
        value = this.queue[0];
        return value;
    }
}
