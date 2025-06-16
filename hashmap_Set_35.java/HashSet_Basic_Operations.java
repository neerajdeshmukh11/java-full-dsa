
import java.util.HashSet;

public class HashSet_Basic_Operations {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        set.remove(3);
        System.out.println(set.isEmpty());
    }
}
