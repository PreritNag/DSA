public class sizeLL{
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
    public int size(){
        int sizee=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sizee++;
        }
        return sizee;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        sizeLL ll=new sizeLL();
        ll.addFirst(1);
        ll.addFirst(2);
        int p=ll.size();
        System.out.println(p);
        ll.print();
    }
}
