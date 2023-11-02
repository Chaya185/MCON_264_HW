package HW_6;

public class Main2 {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insert(40);
        tree.insert(20);
        tree.insert(60);
        tree.insert(50);
        tree.insert(20);
        tree.insert(30);
        tree.insert(80);
        tree.insert(70);

        System.out.println("In-order traversal: ");
        tree.printInOrder();
    }
}
