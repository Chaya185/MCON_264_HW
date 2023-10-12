package HW_4;

public class TestStackADT {
    public static void main(String[] args) {
        //creates a stack for storing integers
        StackAdtImplementation<Integer> intStack = new StackAdtImplementation<>();

        //adds 6 elements to the integer stack
        intStack.push(5);
        intStack.push(10);
        intStack.push(15);
        intStack.push(20);
        intStack.push(25);
        intStack.push(30);

        //call the popAndPeek method to remove and display the pops and peek.
        popAndPeek(intStack);


        //creates a stack for storing integers
        StackAdtImplementation<String> stringStack = new StackAdtImplementation<>();

        //adds 6 elements to the integer stack
        stringStack.push("Apples");
        stringStack.push("Bananas");
        stringStack.push("Oranges");
        stringStack.push("Pears");
        stringStack.push("Grapes");
        stringStack.push("Mangos");

        //call the popAndPeek method to remove and display the pops and peek.
        popAndPeek(stringStack);

    }
    public static void popAndPeek(StackAdtImplementation stack){
        //removes and displays the top 3 elements
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " +stack.pop());
        System.out.println("Pop: " + stack.pop());

        //peeks and displays the top element which is now the 3rd element
        System.out.println("Peek: " + stack.peek());

        //Remove and display the element that was just peeked
        System.out.println("Pop: " + stack.pop() + "\n");
    }
}
