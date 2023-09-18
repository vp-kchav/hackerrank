package intuit.queue;

public class Queue {
    private int arr[];               // array to store queue elements
    private int front;               // front points to front element in the queue
    private int rear;                // rear points to last element in the queue
    private final int capacity;      // maximum capacity of the queue
    private int count;               // current size of the queue

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void dequeue() {

        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("OverFlow");
            throw new RuntimeException("Queue OverFlow");
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("UnderFlow");
            throw new RuntimeException("Queue UnderFlow");
        }
        return arr[front];
    }

    public int size() {
        return count;
    }

    public Boolean isEmpty() {
        return (size() == 0);
    }

    public Boolean isFull(){
        return (size() == capacity);
    }
}
