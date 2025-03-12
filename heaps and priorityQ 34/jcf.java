import java.util.Comparator;
import java.util.PriorityQueue;

public class jcf {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // reverses,  if not the acsending by default

        pq.add(3); // O(logn)
        pq.add(1);
        pq.add(4);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());// O(n)
            pq.remove();// O(logn)
        }
    }
}
