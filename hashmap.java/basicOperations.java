import java.util.HashMap;
public class basicOperations {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        // add values in hashmap
        map.put(1,"tom");
        map.put(2,"jerry");
        map.put(3,"bob");

        // get value
        System.out.println(map.get(1));

        // check
        System.out.println(map.containsKey(2)); // true
        System.out.println(map.containsKey(5)); // false
        
        // remove
        map.remove(3);
        System.out.println(map.containsKey(3)); // false

        // iterating over hashmap
        // type 1
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // type 2
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}