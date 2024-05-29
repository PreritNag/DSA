public class NthRemoveLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
     int sizee = 0;
    public int size() {
       
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sizee++;
        }
        return sizee;
    }
    public void NthRemove(int n){
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head=head.next;
        return;
    }
    int i=1;
    int itofind=sz-n;
    Node prev=head;
    while(i<itofind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
    }
    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        NthRemoveLL ll=new NthRemoveLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.size();
        ll.NthRemove(1);
        ll.print();
    }
    }

