package HW_4;

public class StackAdtImplementation<T> {
    private int size; //holds the size of the linkedLists
    private Node<T> top; //holds the data of the top node

   //constructor
    public StackAdtImplementation(){
        size = 0;
        top = null;
    }

    //this is a private inner class to protect the data
    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //push method adds an element of any data type to the top of the stack
    public void push(T data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop(){
        if (isEmpty()) {
            throw new IllegalStateException("The stack is empty");
        }
        @SuppressWarnings("unchecked")
        T element = (T) top.data;
        top = top.next;
        size--;
        return element;
    }

    public T peek(){
        if (isEmpty()) {
            throw new IllegalStateException("The stack is empty");
        }
        @SuppressWarnings("unchecked")
        T element = (T) top.data;
        return element;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        return false;
    }
}
