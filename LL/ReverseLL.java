public class ReverseLL {
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
  public void reverse(){
    Node curr=tail=head;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
  }
  public void print(){
  if(head==null){
    System.out.println("ll is empty");
    return;
  }
  while(head!=null){
    System.out.print(head.data+"->");
    head=head.next;
  }
  System.out.println("null");
  }
  public static void main(String args[]){
    ReverseLL ll=new ReverseLL();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.reverse();
    ll.print();
  }
}
