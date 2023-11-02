package HW_6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// linked list class - notice that Node is an inner class which we do deliberately
// so that it is available only to us

public class LinkedListsJE {

    private Node<Integer> head;
    int curSize; // so that you know the size of the list otherwise O(N) now O(1)

    private Node<Integer> root;  //for question 2

    // no E in the constructor
    public LinkedListsJE() {
        head = null;
        curSize = 0;
    }

    // inner class
    class Node<Integer> {
        int data;
        Node<Integer> next;

        // for question 2
        Node<Integer> left;
        Node<Integer> right;

        public Node(int i) {
            data = i;
            next = null;

            //for question 2
            this.left = null;
            this.right = null;
        }



        public void setData(int data) {
            this.data = data;
        }

        public Node<Integer> getLeft() {
            return left;
        }

        public Node<Integer> getRight() {
            return right;
        }

        public void setLeft(Node<Integer> left) {
            this.left = left;
        }

        public void setRight(Node<Integer> right) {
            this.right = right;
        }
    }

    // add a node to the head of the list
    public void addFirst(int data) {
        Node<Integer> newNode = new Node<Integer>(data);
        newNode.next = (LinkedListsJE.Node<Integer>) head;

        head = (LinkedListsJE.Node<Integer>) newNode;

        curSize++;
        return;
    }

    // printing out the linked list
    @Override
    public String toString() {
        Node<Integer> ptr = head;
        int count = 1;
        while (ptr != null) {
            System.out.println("node number " + count + ": " + ptr.data);
            ptr = ptr.next;
            count++;
        }
        System.out.println("-----------------------------------");
        return "";
    }

    //question 1:
    // Recursive function to search for a specific value
    public boolean search(int value, Node current) {
        if (current == null) {
            return false; // Value not found
        }
        if (current.data == value) {
            return true; // Value found
        }
        return search(value, current.next);
    }

    public boolean search(int value) {
        return search(value, head);
    }


}