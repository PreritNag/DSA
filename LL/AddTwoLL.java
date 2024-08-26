public class AddTwoLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node addTwoList(Node head1,Node head2){
        String l1="";
        String l2="";
        while(head1!=null){
            l1=l1+head1.data;
            head1=head1.next;
        }
        while(head2!=null){
            l2=l2+head2.data;
            head2=head2.next;
        }
        String L1="";
        String L2="";
        for(int i=l1.length();i>0;i--){
            L1=L1+l1.charAt(i-1);
        }
        for(int i=l2.length();i>0;i--){
            L2=L2+l2.charAt(i-1);
        }
        System.out.println(L1);
        System.out.println(L2);
        int sum=Integer.valueOf(L1)+Integer.valueOf(L2);
        Node dummy=new Node(-1);
        Node current=dummy;
        if(sum==0){
            current.next=new Node(0);
        }
        while(sum!=0){
            current.next=new Node(sum%10);
            current=current.next;
            sum=sum/10;
        }
        return dummy.next;
    }
    public static void main(String args[]){
        Node head1=new Node(2);
        head1.next=new Node(4);
        head1.next.next=new Node(9);
        Node head2=new Node(5);
        head2.next=new Node(6);
        head2.next.next=new Node(4);
        head2.next.next.next=new Node(9);
        Node head=addTwoList(head1,head2);
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
}
