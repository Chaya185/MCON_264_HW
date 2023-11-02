package HW_6;

public class BinaryTree {
    private Node root;
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public BinaryTree(){
        root = null;
    }

    //recursive function to add a node to the binary tree
    private Node insertRecursion(Node root, int data){
        if (root == null){
            return new Node(data);
        }
        if (data < root.data){
            root.left = insertRecursion(root.left, data);
        }
        else if (data > root.data){
            root.right = insertRecursion(root.right, data);
        }
        return root;
    }

    public void insert(int data){
        root = insertRecursion(root, data);
    }

    //recursive function to print value of nodes in in-order traversal
    public void printInOrder(Node node){
        if (node != null){
            printInOrder(node.left);
            System.out.print(node.data + ", ");
            printInOrder(node.right);
        }
    }
    public void printInOrder(){
        printInOrder(root);
    }

    //HW 3
    public static int binarySearch(int[] array, int target){
        return binarySearch(array, target, 0, array.length - 1);
    }
    public static int binarySearch(int[] array, int target, int left, int right){
        if ( left > right) {
            return -1;
        }

        int mid = left + (right - left)/2;

        if (array[mid] == target) {
            return mid;
        }
        if (array[mid] < target){
            return binarySearch(array, target, mid + 1, right);
        }
        return binarySearch(array, target, left, right - 1);
    }
}






