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
}
//class Stack {
//
//
//    constructor(value){
//        this.array = []
//        this.count = 0;
//        this.isEmpty = false;
//    }
//
//    getArray(){
//        return this.array;
//    }
//
//
//    isEmpty() {
//        return this.isEmpty;
//    }
//
//    push(number){
//        this.array[this.count++] = number;
//    }
//
//    validate(){
//        if(this.array === 0)
//            this.isEmpty = true;
//    }
//
//    pop(){
//        this.validate();
//        this.value = this.array[this.count- 1];
//        this.count--;
//        this.array.length = this.count;
//        return this.value;
//    }
//
//    peek(){
//        this.validate();
//        this.value = this.array[this.count - 1];
//    }
//
//    getNumber() {
//        return this.value;
//    }
//}
//
//class Queue {
//
//
//    // Write a class Queue that uses an array to implement the queue data structure.
//    // Implement the following methods: enqueue, dequeue, front, and isEmpty.
//
//    constructor(){
//        this.items = [];
//        this.isEmpty = false;
//        this.count = 0;
//        this.item = 0;
//        this.firstNumber = 0;
//
//    }
//
//    enqueue(item){
//        this.items[this.count++] = item;
//    }
//
//    dequeue(){
//        for(let  i = 0; i < this.items.length - 1; i++){
//            this.items[i] = this.items[i + 1];
//        }
//        this.items.length--;
//        return this.item;
//    }
//
//    getItems(){
//        return this.items;
//    }
//
//    front(){
//        this.item = this.items[this.firstNumber];
//        return this.item;
//    }
//
//    isEmpty(){
//        return this.isEmpty;
//    }
//
//    getItem(){
//        return this.item;
//    }
//
//}