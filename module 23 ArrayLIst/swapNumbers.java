import java.util.ArrayList;

public class swapNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int a = list.get(1);
        int b = list.get(3);
        // swap
        int c = a;
            a = b;
            b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
