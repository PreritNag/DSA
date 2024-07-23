 package Leetcode;
// public class problemll {
//   public class ListNode {
//         int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = null; }
//     }
//    public static ListNode head;
//    public static ListNode tail;
//     public void addFirst(int val) {
//       ListNode newNode = new ListNode(val);
//       if (head == null) {
//         head = tail = newNode;
//         return;
//       }
//       newNode.next = head;
//       head = newNode;
//     }
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//       String str="";
//       String str1="";
//       while(l1!=null || l2!=null){
//         str=str+l1.val;
//         str1=str1+l2.val;
//         l1=l1.next;
//         l2=l2.next;
//       }
//       int c=Integer.valueOf(str)+Integer.valueOf(str1);
//       int k=0;
//       while(c!=0){
//         k=c%10;
//         c=c/10;
//         l1.addFirst(k);
//       }
//     }
//     public static void main(String[] args) {
        
//     }
// }
public class problemll {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static ListNode head;
  public static ListNode tail;

  public void addFirst(int val) {
    ListNode newNode = new ListNode(val);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;

    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (p != null)
        p = p.next;
      if (q != null)
        q = q.next;
    }

    if (carry > 0) {
      curr.next = new ListNode(carry);
    }

    return dummyHead.next;
  }

  public static void main(String[] args) {
    problemll problem = new problemll();
    ListNode l1 = problem.new ListNode(2, problem.new ListNode(4, problem.new ListNode(3)));
    ListNode l2 = problem.new ListNode(5, problem.new ListNode(6, problem.new ListNode(4)));

    ListNode result = problem.addTwoNumbers(l1, l2);

    // Print the result
    while (result != null) {
      System.out.print(result.val);
      if (result.next != null) {
        System.out.print(" -> ");
      }
      result = result.next;
    }
  }
}
