
import java.util.ArrayList;

public class Operations_in_Heap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // 1:- add at last index
            arr.add(data);

            // 2:- fix heap

            int x = arr.size() - 1; // x is child's index
            int par = (x - 1) / 2; // par is parent's index

            while (arr.get(x) < arr.get(par)) { // O(logn)  // > sign for max heap

                // swap

                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;

            }
        }

        public int peek() { // O(1) , the first element will be on top
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){  // < sign for max heap
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){ // < sign for max heap
                minIdx = right;
            }

            if(minIdx!=i){
                //swap the minIdx with i
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // step 1: swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2: remove the last element
            arr.remove(arr.size()-1);

            // step 3: heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }


    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
