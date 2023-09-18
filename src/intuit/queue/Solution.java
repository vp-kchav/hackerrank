package intuit.queue;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main (String[] args){

        MyQueue q = new MyQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());

        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        System.out.println("Queue size is " + q.size());

        q.dequeue();
        q.dequeue();

        System.out.println("Front element is: " + q.peek());

        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
}
