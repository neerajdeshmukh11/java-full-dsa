// Question 2 :
// Kth largest odd number in a given range
// We have two variables L and R, indicating a range of integers from L to R inclusive, and a
// number K, the task is to find Kth largest odd number. If K > number of odd numbers in the range
// L to R then return 0.
// Sample Input 1 : L = -3, R = 3, K = 1
// Sample Output 1 : 3

import java.util.*;


public class info8 {
    public static void main(String[] args) {
        int L = -3, R = 3, K = 1;
        // list to add odd no.s
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = L; i<=R;i++){
            if(i%2!=0){
                ans.add(i);
            }
        }
        // check for the edge case
        if(K>ans.size()){
            System.out.println(0);
        }
        // new array so that we can reverse it
        Integer arr[] = new Integer[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(arr[K - 1]);
    }
}
