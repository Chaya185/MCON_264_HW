package HW_2;

import java.util.*;

class CustomCollection {
    private Integer[] elements;

    public CustomCollection(Integer[] elements) {
        this.elements = elements;
    }

    public Iterator<Integer> iterator(){
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<Integer>{
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elements.length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return elements[currentIndex++];
        }
    }
}

public class number4 {
    public static void main(String[] args){
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        CustomCollection c = new CustomCollection(numbers);
        Iterator<Integer> iterator = c.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
