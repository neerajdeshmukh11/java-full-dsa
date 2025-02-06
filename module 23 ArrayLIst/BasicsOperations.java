
import java.util.ArrayList;

public class BasicsOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // add at a given index
        list.add(5, 6);
        System.out.println(list);
        // get element by index
        int element = list.get(0);
        System.out.println(element);
        // remove element by index
        list.remove(1);
        System.out.println(list);
        // set element in place of the index of the existing element
        list.set(0, 10);
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
        System.out.println(list.size());
    }
}
