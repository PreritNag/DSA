package BST;
import java.util.*;

public class mirrorbst {
    public static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to insert a value into the BST
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
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }
     public static void level(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                // System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }

        }else{
           System.out.print(currNode.data +"->");
        if(currNode.left!=null){
            q.add(currNode.left);
        }
        if(currNode.right!=null){
            q.add(currNode.right);
        }
    }}
    
}
public static void main(String args[]){
    int arr[] = {8,5,3,6,10,11};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = builttree(root, arr[i]);  // Update the root with the newly inserted node
        }
        level(root);
        root=mirror(root);
        System.out.println();
        level(root);
}
}
