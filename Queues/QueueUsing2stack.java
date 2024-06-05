package Queues;
import java.util.*;
public class QueueUsing2stack {
    public static class Queue{
        
        static Stack<Integer> s=new Stack<>();
         static  Stack<Integer> s1=new Stack<>();
            public static boolean isEmpty(){
                return s.isEmpty();
            }
            public static void add(int data){
                while(!s.isEmpty()){
                    s1.push(s.pop());
                }
                s.push(data);
                while(!s1.isEmpty()){
                    s.push(s1.pop());
                }}
                public static int remove(){
                    if(isEmpty()){
                        System.out.println("queue is empty");
                        return -1;
                    }
                    return s.pop();
                }
                public static int peek(){
                    if(isEmpty()){
                        System.out.println("queue is empty");
                    }
                    return s.peek();
                }
            } 
            public static void main(String[] args) {
                Queue q=new Queue();
                q.add(1);
                q.add(2);
                q.add(3);
                while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
                }
            }  
            }
       

    