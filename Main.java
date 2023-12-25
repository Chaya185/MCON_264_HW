package HW_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //Sorting an integer array using selection sort
        Integer[] numbers = {5, 2, 8, 1, 7};
        SelectionSort<Integer> selectionSorter = new SelectionSort<>();
        selectionSorter.sort(numbers); //calls the sort method on the array
        // Display the sorted array
        System.out.println("Sorted int array using selection sort: " + Arrays.toString(numbers));
        System.out.println("Number Swaps: " + selectionSorter.getNumSwaps() +"\n");

        //Sorting a string array using selection sort
        String[] strings = {"Zeek", "Bill", "Mike", "Jack", "Charlie"};
        SelectionSort<String> selectionStringSorter = new SelectionSort<>();
        selectionStringSorter.sort(strings); //calls the sort method on the array
        // Display the sorted array and number swaps
        System.out.println("Sorted string array using selection sort: " + Arrays.toString(strings));
        System.out.println("Number Swaps: " + selectionStringSorter.getNumSwaps() +"\n");

        //Sorting a string array using insertion sort
        String[] names = {"Zeek", "Bill", "Mike", "Jack", "Charlie"};
        InsertionSort<String> insertionStringSorter = new InsertionSort<>();
        insertionStringSorter.sort(names); //calls the sort method on the array
        // Display the sorted array and number swaps
        System.out.println("Sorted string array using insertion sort: " + Arrays.toString(names));
        System.out.println("Number Swaps: " + insertionStringSorter.getNumSwaps() +"\n");

        //Sorting an integer array using insertion sort
        Integer[] num= {5, 2, 8, 1, 7};
        InsertionSort<Integer> insertionIntSorter = new InsertionSort<>();
        insertionIntSorter.sort(num); //calls the sort method on the array
        // Display the sorted array
        System.out.println("Sorted integer array using insertion sort: " + Arrays.toString(num));
        System.out.println("Number Swaps: " + insertionIntSorter.getNumSwaps());
    }
}
