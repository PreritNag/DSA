
public class MergeTwoList {
    // ListNode dummy = new ListNode(-1);
    //     ListNode current = dummy;
    public static class Node{
        int data;
        Node next;
     public Node(int data){
        this.data=data;
        this.next=null;
        }}
        public static Node MergeSortlinked(Node list1,Node list2){
            Node merge=new Node(-1);
            Node current=merge;
            while(list1!=null && list2!=null){
                if(list1.data<list2.data){
                    current.next=list1;
                    list1=list1.next;
                }
                else{
                    current.next=list2;
                    list2=list2.next;
                }
                current=current.next;
            }
            if(list1!=null){
                current.next=list1;
            }
            if(list2!=null){
                current.next=list2;
            }
            return merge.next;
        }
        public static void main(String[] args) {
            Node list1 = new Node(1);
            list1.next = new Node(2);
            list1.next.next = new Node(3);
            list1.next.next.next = new Node(4);

            Node list2 = new Node(3);
            list2.next = new Node(4);
            list2.next.next = new Node(5);
            list2.next.next.next = new Node(6);
            Node mergedList = MergeSortlinked(list1, list2);
            while (mergedList != null) {
                System.out.print(mergedList.data + "->");
                mergedList = mergedList.next;
            }
                }
            
            }
