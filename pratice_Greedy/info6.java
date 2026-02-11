import java.util.Arrays;
import java.util.Collections;

public class info6 {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVert[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHori[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costVert, Collections.reverseOrder());
        Arrays.sort(costHori, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h<costHori.length && v<costVert.length){
            // vertical cost < horizontal
            if(costVert[v] <= costHori[h]){ // horizonal cuts maaro
                cost += (costHori[h] * vp);
                hp++;
                h++;
            }else{
                cost += (costVert[v] * hp);
                vp++;
                v++;
            }
        }
        while(h<costHori.length){
            cost += (costHori[h] * vp);
            hp++;
            h++;
        }
        while(v<costVert.length){
            cost += (costVert[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost required: "+cost);
    }
}
