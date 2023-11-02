package HW_6;

public class Main1 {
    public static void main(String[] args) {
        LinkedListsJE myList = new LinkedListsJE();

        // Adding elements to the linked list
        myList.addFirst(1);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(4);

        // Display the linked list
        myList.toString();

        int searchValue = 3;
        if (myList.search(searchValue)) {
            System.out.println(myList.search(searchValue) +": " + searchValue + " found in the linked list.");
        } else {
            System.out.println("false: " + searchValue + " not found in the linked list.");
        }

        searchValue = 5;
        if (myList.search(searchValue)) {
            System.out.println("true: " + searchValue + " found in the linked list.");
        } else {
            System.out.println("false: " + searchValue + " not found in the linked list.");
        }
    }
}
