package Trees;

import java.util.ArrayList;

public class mindisnode {
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
    }    public static boolean  pathfinder(Node root,ArrayList<Integer> path,int n){
        if(root==null){
            return false;
        }
        path.add(root.data);
        if(root.data==n){
            return true;
        }
       boolean found = pathfinder(root.left, path, n);
       boolean found1 = pathfinder(root.right, path, n);
       if(found || found1){
           return true;
       }
       path.remove(path.size()-1);
       return false;
    }
    public static void minimdis(Node root,int n1,int n2){
        ArrayList<Integer> path1=new ArrayList<>();
        ArrayList<Integer> path2=new ArrayList<>();
        pathfinder(root,path1,n1);
        pathfinder(root,path2,n2);
        System.out.println((path1.size()-1)+(path2.size()-1));
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.builttree(nodes);
        minimdis(root,2,3);
    }
}
