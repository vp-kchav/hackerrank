package datastructure;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SingleLinkList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
//        while (node != null) {
//            bufferedWriter.write(String.valueOf(node.data));
//
//            node = node.next;
//
//            if (node != null) {
//                bufferedWriter.write(sep);
//            }
        //}
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        if (head == null) {
            return newHead;
        } else {
            //SinglyLinkedList llist = new SinglyLinkedList();
            SinglyLinkedListNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newHead;
        }
        return head;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        if (head == null) {
            return newHead;
        } else {
            newHead.next = head;
        }
        return newHead;
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        int i = 1;
        SinglyLinkedListNode temp = llist;
        while(i != position) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return llist;
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        int i =1;
        SinglyLinkedListNode temp = llist;
        while (i != position) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

        StringBuilder builder = new StringBuilder();

        return llist;
    }


    /**
     *
     * public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
     *     SinglyLinkedListNode temp=head;
     *     if (head==null||head.next==null) {
     *         return head;
     *     }
     *     else if(position==0){
     *         head=head.next;
     *         return head;
     *     }
     *
     *     for (int i = 0; i < position-1; i++) {
     *         temp=temp.next;
     *     }
     *     temp.next=(temp.next).next;
     *     return head;
     *     }
     */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
        SinglyLinkedList llist = new SinglyLinkedList();
//
//        int llistCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int []array =  {141, 302 ,164 ,530 ,474};

        for (int i = 0; i < array.length; i++) {
//            int llistItem = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            //SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, array[i]);
            SinglyLinkedListNode insertNodeAtHead = insertNodeAtHead(llist.head, array[i]);

            llist.head = insertNodeAtHead;
        }

        //SinglyLinkedListNode insertNodeAtHead12 = insertNodeAtPosition(llist.head, 1,2);
        SinglyLinkedListNode insertNodeAtHead12 = deleteNode(llist.head,5);


        printSinglyLinkedList(llist.head, "\n");
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
