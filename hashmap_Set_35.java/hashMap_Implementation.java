import java.util.*;

public class hashMap_Implementation {

    static class HashMap<K, V> { // generic ,, data type not fixd at start

        private class Node { // hashmap ke har bucket ke andar jo LinkedList ki nodes hai unka type batata
                             // hai
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n ,, total no. of nodes
        private int N;
        private LinkedList<Node> buckets[]; // N = buckets[] array jiska type hai linkedList(matlab isme LL store hai)

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; // kuchh versions mein yaha error ayega issiliye supress warning

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // buckets ke har index pe 1 khali linkedlist bani hai
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode(); // returns a hashcode

            // find the absolute value
            return Math.abs(hc) % N; // for values 0 to 3
        }

        private int searchinLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // nodes ko nikal ke new bucket ke andar daalenge
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { // O(lamda) == O(1)
            int bi = hashFunction(key); // bi = bucket index // 0 to 3
            int di = searchinLL(key, bi); // di = data index // if present then valid index , if not then -1;

            if (di != -1) { // matlab woh key already exist karti hai , update karo
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { // O(lamda) == O(1)
            int bi = hashFunction(key);
            int di = searchinLL(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) { // O(lamda) == O(1)
            int bi = hashFunction(key);
            int di = searchinLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) { // O(lamda) == O(1)
            int bi = hashFunction(key);
            int di = searchinLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("india"));
        System.out.println(hm.remove("india"));
        System.out.println(hm.get("india"));
    }
}
