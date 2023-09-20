package HW_3;
import java.util.*;

public class number1 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.addAll(numbers);
        System.out.println(uniqueNumbers);
    }
}
