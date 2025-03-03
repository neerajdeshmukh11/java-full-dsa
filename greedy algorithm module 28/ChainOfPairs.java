// max length chain of pairs

import java.util.Arrays;
import java.util.Comparator;
public class ChainOfPairs { // 0(nlogn)
    public static void main(String[] args) {
        int pairs[][] = {{5,24},
                        {39,60},
                        {5,28},
                        {27,40},
                        {50,90}
                        }; // o/p == 3

        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pairs[0][1]; // last selected chain end

        for (int i = 0; i < pairs.length; i++) {
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
                
            }  
        }
        System.out.println("the max no. of chain formed: "+chainLen);

    }
}
