package ShoppingPriorityQueue;
import java.util.ArrayList;
import java.util.List;
class PriorityQueue<T extends Comparable<T>>{

    private List<T> heap;

    public PriorityQueue() {
        this.heap = new ArrayList<>();
    }

    public void enqueue(T element) {
        heap.add(element);
        heapifyUp(); // Restore heap property
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }

        T highestPriority = heap.get(0);
        int lastIndex = heap.size() - 1;
        // Move the last element of the array to the zeroth position
        heap.set(0, heap.get(lastIndex));
        // Delete from the back of the queue
        heap.remove(lastIndex);
        heapifyDown(); // Restore heap property
        return highestPriority;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // We place the enqueued item at the end of the array
    // and continuously swap with the parent until
    // the child is less than the parent
    private void heapifyUp() {
        int currentIndex = heap.size() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            if (heap.get(currentIndex).compareTo(heap.get(parentIndex)) < 0) {
                // Swap elements if the current element has higher priority than its parent
                swap(currentIndex, parentIndex);
                currentIndex = parentIndex; // Move up in the heap
            } else {
                break; // Heap property is restored
            }
        }
    }

    private void heapifyDown() {
        int currentIndex = 0;
        int size = heap.size();

        while (true) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            int smallestChildIndex = currentIndex;

            // Find the smallest child (if any)
            // Compare current to contents of left child
            if (leftChildIndex < size && heap.get(leftChildIndex).compareTo(heap.get(smallestChildIndex)) < 0) {
                smallestChildIndex = leftChildIndex;
            } // Compare current to contents of right child
            if (rightChildIndex < size && heap.get(rightChildIndex).compareTo(heap.get(smallestChildIndex)) < 0) {
                smallestChildIndex = rightChildIndex;
            }

            if (smallestChildIndex != currentIndex) {
                // Swap elements if the smallest child has higher priority than the current element
                swap(currentIndex, smallestChildIndex);
                currentIndex = smallestChildIndex; // Move down in the heap
            } else {
                break; // Heap property is restored
            }
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}