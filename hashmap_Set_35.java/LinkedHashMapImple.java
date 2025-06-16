import java.util.*;

public class LinkedHashMapImple {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 100);
        lhm.put("china", 150);
        lhm.put("us", 50);
        lhm.put("nepal", 5);

        System.out.println(lhm);  // This will print in insertion order
    }
}
