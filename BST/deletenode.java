package BST;

public class deletenode {
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
    public static Node deletenoder(Node root,int val){
        //case  1: node to be deleted is a leaf node
        if(root.data>val){
          root.left=  deletenoder(root.left,val);
        }
        else if(root.data<val){
           root.right= deletenoder(root.right,val);
        }

           else{  //case  1: node to be deleted is a leaf node
             if(root.left==null && root.right==null ){
                root=null;
                return root;
             }
             //case  2: node to be deleted has one child
             else if(root.left==null){
                root=root.right;
                return root;

             }
             else if(root.right==null){
                root=root.left;
                return root;
            }
            //case  3: node to be deleted has two children
            else{
                Node IS=successor(root.right);
                root.data=IS.data;
                deletenoder(root.right,IS.data);
            }}
            
        return root;
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }
    public static Node successor(Node root){
        while(root.left!=null){
            root=root.left;}
            return root;
        }
    public static void main(String[] args) {
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = builttree(root, arr[i]);  // Update the root with the newly inserted node
        }
        preorder(root);  // Print the preorder traversal of the BST
        root=deletenoder(root,1);
        preorder(root);
    }
}
// package BST;

// public class deletenode {
//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // Method to insert a value into the BST
//     public static Node builttree(Node root, int val) {
//         if (root == null) {
//             return new Node(val);  // Create a new node if the root is null
//         }
//         if (root.data > val) {
//             root.left = builttree(root.left, val);  // Insert into the left subtree
//         } else {
//             root.right = builttree(root.right, val);  // Insert into the right subtree
//         }
//         return root;  // Return the (possibly unchanged) root node
//     }

//     // Method to delete a node from the BST
//     public static Node deletenoder(Node root, int val) {
//         if (root == null) {
//             return null;  // Return null if the node to be deleted is not found
//         }

//         if (val < root.data) {
//             root.left = deletenoder(root.left, val);  // Recur down the left subtree
//         } else if (val > root.data) {
//             root.right = deletenoder(root.right, val);  // Recur down the right subtree
//         } else {
//             // Node with only one child or no child
//             if (root.left == null) {
//                 return root.right;
//             } else if (root.right == null) {
//                 return root.left;
//             }

//             // Node with two children: Get the inorder successor (smallest in the right subtree)
//             Node successor = findMin(root.right);
//             root.data = successor.data;  // Copy the inorder successor's content to this node
//             root.right = deletenoder(root.right, successor.data);  // Delete the inorder successor
//         }

//         return root;
//     }

//     // Method to find the minimum value node in a subtree
//     public static Node findMin(Node root) {
//         while (root.left != null) {
//             root = root.left;
//         }
//         return root;
//     }

//     // Preorder traversal of the BST
//     public static void inorder(Node root) {
//         if (root == null) {
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     public static void main(String[] args) {
//         int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null;
//         for (int i = 0; i < arr.length; i++) {
//             root = builttree(root, arr[i]);  // Update the root with the newly inserted node
//         }
//         System.out.println("Preorder traversal before deletion:");
//         inorder(root);  // Print the preorder traversal of the BST
//         System.out.println();
        
//         root = deletenoder(root, 1);  // Delete node with value 1
//         System.out.println("Preorder traversal after deletion:");
//         inorder(root);  // Print the preorder traversal of the BST after deletion
//     }
// }
