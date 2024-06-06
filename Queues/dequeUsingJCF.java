package Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class dequeUsingJCF {
    static class stack{
        Deque<Integer> deque=new LinkedList();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();}
    }
}
