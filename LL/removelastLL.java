public class removelastLL {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void middadd(int data, int idx) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removefirst() {
        head = head.next;
    }
   
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    int sizee=0;
    public int size() {
         
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sizee++;
        }
        return sizee;
    }
    public void removelast(){
    if(sizee==0){
        System.out.println("LL is empty");
        return;
    }
    else if(sizee==1){
    head=tail=null;
    return;
    }
    Node temp=head;
    for(int i=0;i<sizee-2;i++){
    temp=temp.next;
    }
    temp.next=null;
    sizee--;
    }

    public static void main(String args[]) {
        removelastLL ll = new removelastLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.middadd(3, 2);
        System.out.println(ll.size());
        ll.removelast();
        // ll.removefirst();
        ll.print();
    }
}
