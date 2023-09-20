package HW_3;

import java.util.*;

public class number4 {
    public static void main(String[] args){
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> numberList = Arrays.asList(numbers);
        Iterator<Integer> iterator = numberList.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
