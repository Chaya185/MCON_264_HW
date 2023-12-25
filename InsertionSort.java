package HW_14;

import java.util.Comparator;

//Insertion sort sorting algorithms that accepts a generic object type
//Utilizes the comparable interface for enabling comparisons between objects

//Generics are used to make the sorting algorithms work with any object type,
//providing flexibility in the type of data they can handle
public class InsertionSort<T> {
    private Comparator<T> comparator;
    int numSwaps; //keeps track of number swaps per sort

    //no arg constructor
    public InsertionSort(){
        this.comparator = (a, b) -> ((Comparable<T>) a).compareTo(b);
        numSwaps = 0;
    }

    //constructor with custom comparable - so not a natural sort :
    //The Comparable interface is used to enable comparisons between objects based on their natural order
    public InsertionSort(Comparable<T> comparable) {
        this.comparator = (a, b) -> comparable.compareTo((T) b);
        numSwaps = 0;
    }

    // Constructor with a custom comparator
    //The Comparator interface is used to provide an alternative way of comparing objects based on different criteria.
    //It allows for custom ordering that might not be inherent in the objects being compared.
    public InsertionSort(Comparator<T> comparator) {
        this.comparator = comparator;
        numSwaps = 0;
    }

    //algorithm that performs insertion sort
    public void sort(T[]arr) {
        int n = arr.length;

        for (int lastUnsortedIndex = 1; lastUnsortedIndex < n; lastUnsortedIndex++) {
            int unsortedIndex = lastUnsortedIndex;

            // Iterate through the unsorted portion from UnsortedIndex to 0
            while (unsortedIndex > 0 && comparator.compare(arr[unsortedIndex], arr[unsortedIndex - 1]) < 0) {
                // Compare and swap if necessary
                swap(arr, unsortedIndex, unsortedIndex - 1);

                // Move to the previous position in the unsorted portion
                unsortedIndex--;
            }
        }
    }
    private void swap(T[] arr, int i, int j) {
        numSwaps++; //increments to keep track of numSwaps
        // Swap elements in the array
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //returns the variable holding the number of swaps
    public int getNumSwaps(){
        return numSwaps;
    }
}