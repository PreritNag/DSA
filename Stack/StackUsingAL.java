package DSA.Stack;

import java.util.ArrayList;
public class StackUsingAL{
   public static class StackB{
   static ArrayList<Integer> list=new ArrayList<>();
   public boolean isEmpty(){
    return list.size()==0;
   }
   public static void push(int data){
    list.add(data);
   }
   public static int pop(){
    int top=list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;
   }
   public static int peek(){
    return list.get(list.size()-1);
   }
}
public static void main(String args[]){
    StackB s=new StackB();
    s.push(1);
    s.push(2);
    s.push(3);
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
    
}}
