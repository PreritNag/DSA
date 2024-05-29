public class detectingcycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public boolean detectingcycle(){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast){
             return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        detectingcycle ll=new detectingcycle();
        head=new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next = new Node(5);
        // head.next.next=head;
        if(ll.detectingcycle()){
            System.out.println("cycle is exist");
        }
        else{
            System.out.println("cycle is not exist");
        }
    }

}
