package Queues;

public class ArrayQueue {
    int[] arr;
    int capacity;
    int size;
    int rear;
    int front;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
        this.rear = -1;
        this.front = 0;
    }

    public void enqueue(int data) {
        if (this.isFull()) {
            System.out.println("queue is full");
        } else {
            ++this.rear;
            this.arr[this.rear] = data;
            ++this.size;
        }
    }

    public void dequeue() {
        int data = 0;
        if (this.isEmpty()) {
            System.out.println("it is empty");
        } else {
            data = this.arr[this.front];
            ++this.front;
            --this.size;
        }

        System.out.println(data);
    }

    public void peek() {
        if (this.isEmpty()) {
            System.out.println("queue is empty");
        } else {
            System.out.println(this.arr[this.front]);
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public int size() {
        return this.size;
    }

    public void print() {
        for(int i = this.front; i < this.capacity; ++i) {
            int var10001 = this.arr[i];
            System.out.print(var10001 + " ");
        }

    }
}
