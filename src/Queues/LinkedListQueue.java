package Queues;

public class LinkedListQueue {
    Nodes front = null;
    Nodes rear = null;

    public void enqueues(int data) {
        Nodes n = new Nodes(data);
        if (this.front == null) {
            this.front = n;
            this.rear = n;
        } else {
            this.rear.next = n;
            this.rear = n;
        }

    }

    public void dequeues() {
        if (this.front == null) {
            System.out.println("queue is empty");
        } else {
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }

        }
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public int size() {
        int count = 0;

        for(Nodes curr = this.front; curr != null; curr = curr.next) {
            ++count;
        }

        return count;
    }

    public void display() {
        for(Nodes curr = this.front; curr != null; curr = curr.next) {
            System.out.print(curr.data + " ");
        }

    }
}
