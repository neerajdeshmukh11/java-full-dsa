import java.util.*;

public class DequeP1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq); // [1,2,3,4,5]
        dq.removeFirst();
        dq.removeLast();
        // dq.remove(); removes from fisrt by default
        System.out.println(dq); //[2,3,4]
        System.out.println(dq.getFirst()); // 2
        System.out.println(dq.getLast()); // 4

    }
}
