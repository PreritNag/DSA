package BST;
import java.util.*;

public class balancedbst {
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
    public static Node balance(int arr[],int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=balance(arr, st, mid-1);
        root.right=balance(arr, mid+1, end);
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
        int arr[]={3,5,6,8,10,11,12};
        Node root=null;
        root=balance(arr, 0, arr.length-1);
        level(root);
    }
}
