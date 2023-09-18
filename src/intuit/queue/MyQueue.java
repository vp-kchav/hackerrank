package intuit.queue;

public class MyQueue {
    private int []array;
    private int capability;
    private int count;
    private int front;
    private int rear;

    public MyQueue(int capability) {
        array = new int[capability];
        this.capability = capability;
        front = 0;
        rear = -1;
        count = 0;
    }

    public synchronized void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            throw new RuntimeException();
        }
        rear = (rear + 1) % capability;
        array[rear] = value;
        count++;
    }

    public synchronized int dequeue() {
        if (count == 0) {
            System.out.println("No data to dequeue!");
            throw new RuntimeException();
        }
        int value = array[front];
        front = (front + 1) % capability;
        count--;
        return value;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("No Data");
        }
        return array[front];
    }

    public int size() {
        return count;
    }

    private boolean isFull() {
        return this.count == this.capability;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }
}
