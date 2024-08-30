package Trees;

public class rangeSum {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static class binarytree {
        static int idx = -1;

        public static Node builttree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builttree(nodes);
            newNode.right = builttree(nodes);
            return newNode;
        }
}
 public static int rangeSumBST(Node root, int low, int high) {
        int sum=0;
        
        if(root==null){
            return 0;
        }
        if(root.data>=low && root.data<=high){
            sum+=root.data;
        }
        sum+=rangeSumBST(root.left,low,high);
        sum+=rangeSumBST(root.right,low,high);
        return sum;
    }
    public static  Node searchBST(Node root, int val) {
        if(root==null){
            return null;
        }
        if(root.data==val){
            return root;
        }
        return root.data<val?searchBST(root.right,val):searchBST(root.left,val);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={10,5,3,-1,-1,7,-1,-1,15,-1,18,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.builttree(nodes);
        // System.out.println(rangeSumBST(root, 7, 15));
        Node temp=null;
       temp=searchBST(root,5);
       preorder(temp);
    }
}
