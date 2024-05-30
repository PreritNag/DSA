public class delectingcycleLL {
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

    public static void delectingcycle() {
        Node fast = head;
        Node slow = head;
        boolean cycle = false;

        // Detect cycle using Floyd's Tortoise and Hare algorithm
        while (fast != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return; // No cycle detected
        }

        // Find the start of the cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the cycle
        if (prev != null) {
            prev.next = null;
        }
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

    public static void main(String args[]) {
        delectingcycleLL ll = new delectingcycleLL();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        // head.next.next.next.next.next.next = new Node(7);
        // head.next.next.next.next.next.next.next = new Node(8);
        // head.next.next.next.next.next.next.next.next = new Node(9);
        // Creating a cycle for testing
        head.next.next.next.next.next.next= head.next.next;
        ll.delectingcycle();
        ll.print();
    }
}
