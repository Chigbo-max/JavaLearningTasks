package DataStructures;

public class Stacks {

    private int size;
    private int[] stack;
    private int count;
    private int value;

    public Stacks(int size) {
        this.size = size;
        this.stack = new int[size];
        this.count = 0;
        this.value = 0;
    }
    
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }


    public void push(int number) {
        if(isFull()) {throw new IllegalArgumentException("Stack is full");}
        this.stack[this.count++] = number;
    }

    public int[] getPush(){
        return this.stack;
    }

    public int pop() {
        this.value = this.stack[this.count - 1];
        this.count--;
        return this.value;
    }



    public int[] getStack() {
        return this.stack;
    }

    public int getValue(){
        return this.value;
    }

    public int peek() {
        this.value = this.stack[this.count - 1];
        return this.value;
    }

    private boolean isFull() {
        return this.size == count;
    }
}
