package DataStructures;

public class Queues {

    private int size;
    private int[] queue;
    int count;

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
}
