package BST;  // Ensure this matches your directory structure or remove if not using packages

public class BuiltBST {
    
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

    // Preorder traversal of the BST
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = builttree(root, arr[i]);  // Update the root with the newly inserted node
        }
        preorder(root);  // Print the preorder traversal of the BST
    }
}
