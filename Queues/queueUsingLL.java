package Queues;

import java.util.*;

public class queueUsingLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queue {
        public static Node head;
        public static Node tail;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode; // corrected initialization for an empty queue
                return;
            }
            tail.next = newNode;
            tail = newNode; // corrected assignment
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int top = head.data;
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
