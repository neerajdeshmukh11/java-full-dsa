
import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVert[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHori[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costVert, Collections.reverseOrder());
        Arrays.sort(costHori, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1; // horizontal and vertical pieces
        int cost = 0;

        while (h < costVert.length && v < costHori.length) {
            // vertical cost < horizontal cost
            if (costVert[v] <= costHori[h]) { // horizontal cut
                cost = cost + (costHori[h] * vp);
                hp++;
                h++;
            } else { // vertical cut
                cost = cost + (costVert[v] * hp);
                vp++;
                v++;

            }
        }
        while(h<costHori.length){  // jitne bhi horizonal cuts bachh gaye hai
            cost = cost + (costHori[h] * vp);
                hp++;
                h++;
        }
        while(v<costVert.length){  // jitne bhi horizonal cuts bachh gaye hai
            cost = cost + (costVert[h] * hp);
            vp++;
            v++;
        }
        System.out.println("minimum cost of cuts = "+cost);

    }
}
