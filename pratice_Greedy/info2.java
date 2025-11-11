
import java.util.ArrayList;

// Activity Selection 

public class info2 {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // already sorted according to the end time 
        ArrayList<Integer> ans = new ArrayList<>();

       int maxAct = 1; // initially 

        ans.add(0);
        int endTime = end[0];

        for(int i=1;i<end.length;i++){
            if(start[i]>=endTime){
                maxAct++;
                ans.add(i);
                endTime = end[i];
            }
        }
        System.out.println("The max activities to be done are: "+ maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
