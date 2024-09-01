package BST;
import java.util.*;

public class bsttobalance {
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
    // public static Node builttree(Node root, int val) {
    //     if (root == null) {
    //         return new Node(val);  // Create a new node if the root is null
    //     }
    //     if (root.data > val) {
    //         root.left = builttree(root.left, val);  // Insert into the left subtree
    //     } else {
    //         root.right = builttree(root.right, val);  // Insert into the right subtree
    //     }
    //     return root;  // Return the (possibly unchanged) root node
    // }
    public static Node balancebst(ArrayList<Integer> arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=balancebst(arr,st,mid-1);
        root.right=balancebst(arr,mid+1,end);
        return root;
    }
    public static void inorder(ArrayList<Integer> arr,Node root){
        int i=0;
        if(root==null){
            return;
        }
        inorder(arr,root.left);
        arr.add(root.data);
        inorder(arr,root.right);
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
        // int arr[] = {};
        // Node root=null;
        // for(int i=0;i<arr.length;i++){
        //     root=builttree(root,arr[i]);
        // }
        ArrayList<Integer> arr=new ArrayList<>();
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        inorder(arr,root);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        root=balancebst(arr,0,arr.size()-1);
        level(root);
    }
        }
    

