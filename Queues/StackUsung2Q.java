package Queues;

import java.util.*;

public class StackUsung2Q {
    public static class Stack{
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    public static Boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void add(int data){
        if(!q1.isEmpty()){
         q1.add(data);
        }
        else{
            q2.add(data);
        }
    }
    public static int pop(){
        int top=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                 top=q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }}
            else if(!q2.isEmpty()){
              while (!q2.isEmpty()) {
                 top=q2.remove();
                if(q2.isEmpty()){break;}
                q1.add(q2.remove());
            }
            }
            return top;    
            }
            public static int peek(){
                int top=-1;
                if(!q1.isEmpty()){
                    while (!q1.isEmpty()) {
                        top=q1.remove();
                        q2.add(top);
                        
                    }}else{
                        while (!q2.isEmpty()) {
                        top=q2.remove();
                        q1.add(top);
                        
                    }
                    }
                    return top;
                }
            }
            public static void main(String[] args) {
                Stack s=new Stack();
                s.add(1);
                s.add(2);
                s.add(3);
                while(!s.isEmpty()){
                    System.out.println(s.peek());
                    s.pop();
                }
            }
        }
    
    