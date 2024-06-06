package heap;

import java.util.PriorityQueue;

public class JCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        pq.add(4);
        pq.add(1);
        pq.add(3);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
