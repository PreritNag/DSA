public class SearchLL {
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
    int c=1;
    public int search(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return c;
            }
            temp=temp.next;
            c++;
        }
        return 0;
    }
    public static void main(String args[]){
        SearchLL ll=new SearchLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println(ll.search(4));

    }
}
