public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int value) {
        if(root == null) {
            return new Node(value);
        }
        if(value < root.data) {
            root.left = insert(root.left, value);
        }
        else if(value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    static boolean search(Node root, int value) {
        if(root == null)
            return false;
        if(root.data == value)
            return true;
        if(value < root.data)
            return search(root.left, value);
        return search(root.right, value);
    }

    static Node minValueNode(Node root) {
        Node current = root;
        while(current.left != null) {
            current = current.left;
        }
        return current;
    }

    static Node delete(Node root, int value) {
        if(root == null)
            return null;
        if(value < root.data) {
            root.left = delete(root.left, value);
        }
        else if( value > root.data) {
            root.right = delete(root.right, value);
        }
        else {
            // case 1 and case 2
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            // case 3
            Node successor = minValueNode(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }
    // Static Inorder Left -> Root -> Right
    static void Inorder(Node root) {
        if(root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        // Create
        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);
        
        System.out.print("BST: ");
        Inorder(root);

        // Read
        System.out.println("\nSearch 60: " + search(root, 60));

        // Update

        root = delete(root, 40);
        root = insert(root, 45);
        System.out.print("BST after update 40 -> 45 : ");
        Inorder(root);

        // Delete

        root = delete(root, 30);
        System.out.print("\nBST after delete 30 : ");
        Inorder(root);
    }
}