package HW_14;

import java.util.Comparator;

//Selection sort sorting algorithms that accepts a generic object type
//Utilizes the comparable interface for enabling comparisons between objects

//Generics are used to make the sorting algorithms work with any object type,
//providing flexibility in the type of data they can handle
public class SelectionSort<T> {
    private Comparator<T> comparator;
    int numSwaps; //keeps track of number swaps per sort

    public SelectionSort(){
        this.comparator = (a, b) -> ((Comparable<T>) a).compareTo(b);
        numSwaps = 0;
    }

    //constructor with custom comparable - so not a natural sort :
    //The Comparable interface is used to enable comparisons between objects based on their natural order
    public SelectionSort(Comparable<T> comparable) {
        this.comparator = (a, b) -> comparable.compareTo((T) b);
        numSwaps = 0;
    }

    // Constructor with a custom comparator
    //The Comparator interface is used to provide an alternative way of comparing objects based on different criteria.
    //It allows for custom ordering that might not be inherent in the objects being compared.
    public SelectionSort(Comparator<T> comparator) {
        this.comparator = comparator;
        numSwaps = 0;
    }

    //algorithm that performs selection sort
    public void sort(T[]arr){
        int n = arr.length;

        //loops through the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(arr[j], arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            //If minIndex is not i, it increments numSwaps to keep track of number of swaps
            if (minIndex != i){
                numSwaps++;
            }

            // Swap the found minimum element with the first element of the unsorted array
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    //returns the variable holding the number of swaps
    public int getNumSwaps(){
        return numSwaps;
    }
}
