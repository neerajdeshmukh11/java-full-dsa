
import java.util.TreeMap;


public class TreeMapImple {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("india", 100);
        tm.put("china", 150);
        tm.put("us", 50);
        tm.put("nepal", 5);

        System.out.println(tm);
    }
}
