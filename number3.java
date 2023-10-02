package HW_2;
import java.util.Iterator;
import java.lang.Iterable;

class MyArray implements Iterable<Integer> {
    private int[] arr;

    public MyArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

	//nested class 
    private class MyIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < arr.length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return arr[index++];
        }
    }
}


public class number3{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        MyArray arr = new MyArray(numbers);
        for(int number : arr){
            System.out.println(number);
        }
    }
}
