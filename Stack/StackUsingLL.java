package DSA.Stack;

public class StackUsingLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class StackB{
      static  Node head=null;
        public static Boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public static void push(int data){
       Node newNode=new Node(data);
        if(isEmpty()){
         head=newNode;
         return;
        }
        newNode.next=head;
        head=newNode;
        }
      public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
      }
      public static int peek(){
          if (isEmpty()) {
              return -1;
          }
          return head.data;
      }
    }
    public static void main(String args[]){
        StackB ll=new StackB();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        while(!ll.isEmpty()){
            System.out.println(ll.peek());
            ll.pop();
        }
    }
    }

