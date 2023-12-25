package HW_14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class HW_14_TESTS {

	    // Test case for selection sort with integers
	    @Test
	    public void testSelectionSortWithIntegers() {
	        Integer[] input = {5, 2, 8, 1, 7};
	        Integer[] expected = {1, 2, 5, 7, 8};
	        SelectionSort<Integer> selectionSorter = new SelectionSort<>();
	        selectionSorter.sort(input);
	        assertArrayEquals(expected, input);
	        assertEquals(3, selectionSorter.getNumSwaps()); // Adjust the expected number of swaps based on your implementation
	    }

	    // Test case for selection sort with strings
	    @Test
	    public void testSelectionSortWithStrings() {
	        String[] input = {"Zeek", "Bill", "Mike", "Jack", "Charlie"};
	        String[] expected = {"Bill", "Charlie", "Jack", "Mike", "Zeek"};
	        SelectionSort<String> selectionSorter = new SelectionSort<>();
	        selectionSorter.sort(input);
	        assertArrayEquals(expected, input);
	        assertEquals(3, selectionSorter.getNumSwaps()); // Adjust the expected number of swaps based on your implementation
	    }

	    // Test case for insertion sort with strings
	    @Test
	    public void testInsertionSortWithStrings() {
	        String[] input = {"Zeek", "Bill", "Mike", "Jack", "Charlie"};
	        String[] expected = {"Bill", "Charlie", "Jack", "Mike", "Zeek"};
	        InsertionSort<String> insertionSorter = new InsertionSort<>();
	        insertionSorter.sort(input);
	        assertArrayEquals(expected, input);
	        assertEquals(7, insertionSorter.getNumSwaps()); // Adjust the expected number of swaps based on your implementation
	    }

	    // Test case for insertion sort with integers
	    @Test
	    public void testInsertionSortWithIntegers() {
	        Integer[] input = {5, 2, 8, 1, 7};
	        Integer[] expected = {1, 2, 5, 7, 8};
	        InsertionSort<Integer> insertionSorter = new InsertionSort<>();
	        insertionSorter.sort(input);
	        assertArrayEquals(expected, input);
	        assertEquals(5, insertionSorter.getNumSwaps()); // Adjust the expected number of swaps based on your implementation
	    }

	    // Additional test case for insertion sort with an already sorted array
	    @Test
	    public void testInsertionSortWithSortedArray() {
	        Integer[] input = {1, 2, 3, 4, 5};
	        Integer[] expected = {1, 2, 3, 4, 5};
	        InsertionSort<Integer> insertionSorter = new InsertionSort<>();
	        insertionSorter.sort(input);
	        assertArrayEquals(expected, input);
	        assertEquals(0, insertionSorter.getNumSwaps()); // No swaps should be performed on a sorted array
	    }
	}
