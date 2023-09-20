package HW_3;
import java.util.*;

public class number2 {
    public static void main(String[] args){
        Map<String, String> shoes = new HashMap<String, String>();
        shoes.put("Nike Blazers", "Nike");
        shoes.put("Jordans", "Nike");
        shoes.put("Converse Chuck Taylor All Star High Top", "Converse");
        shoes.put("Converse Chuck Taylor All Star Lift", "Converse");
        shoes.put("Dr Martens 1460", "Dr Martens");
        shoes.put("DrMartens Jadon", "DrMartens");
        shoes.put("Birkenstock Arizona", "Birkenstock");
        shoes.put("Birkenstock Gizeh", "Birkenstock");
        shoes.put("UGG Classic Short", "UGG");
        shoes.put("UGG Bailey Button", "UGG");
        Map<String, String> sortedShoes = new TreeMap<>(shoes);
        System.out.println(sortedShoes);
    }
}
