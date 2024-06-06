package Queues;

import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList();
        deque.addLast(1);
        deque.addLast(2);
        // deque.removeFirst();
        deque.addLast(3);deque.add(4);
        deque.addLast(5);
        System.out.println(deque);
    }
}
