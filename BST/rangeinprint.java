package BST;

public class rangeinprint {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node builttree(Node root, int val) {
        if (root == null) {
            return new Node(val);  // Create a new node if the root is null
        }
        if (root.data > val) {
            root.left = builttree(root.left, val);  // Insert into the left subtree
        } else {
            root.right = builttree(root.right, val);  // Insert into the right subtree
        }
        return root;  // Return the (possibly unchanged) root node
    }
    public static void printrange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if((root.data>=k1)&&(root.data<=k2)){
            System.out.print(root.data+" ");
            printrange(root.left, k1, k2);
            printrange(root.right, k1, k2);
            return;
        }
        else if(root.data>k1){
            printrange(root.left,k1,k2);
        }
        if(root.data<k2){
            printrange(root.right,k1,k2);}
    }
    public static void main(String[] args) {
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = builttree(root, arr[i]);  // Update the root with the newly inserted node
        }
        printrange(root,5,12);}
}


