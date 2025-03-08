// 2379. Minimum Recolors to Get K Consecutive Black Blocks
import java.util.*;

public class problem8march {
    public static int CountConsecutive(String blocks,int k){
        Queue<Integer> queue = new LinkedList<>();
        int whiteCount = 0, minRecolors = 0;

        // pehli window ko process karo
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                queue.add(i);
                whiteCount++;
            }
        }
        minRecolors = whiteCount; // initial white count ko store karo

        // Slide the window
        for (int i = k; i < blocks.length(); i++) {
            // out of bound element ko nikalo
            if (!queue.isEmpty() && queue.peek() == (i - k)) {
                queue.remove(); // remove
                whiteCount--; // white ko nikala na toh count bhi kam karo
            }

            // new 'W' add karo agar bacha ho toh
            if (blocks.charAt(i) == 'W') {
                queue.add(i);
                whiteCount++;
            }

            // Update the minimum recolors 
            minRecolors = Math.min(minRecolors, whiteCount);
        }

        return minRecolors;
    }
   public static void main(String[] args) {
        String blocks = "WBWBBBW";
        int k = 2;
        System.out.println(CountConsecutive(blocks, k));
   } 
}
