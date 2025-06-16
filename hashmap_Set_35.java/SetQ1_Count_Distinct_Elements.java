
import java.util.HashSet;

public class SetQ1_Count_Distinct_Elements {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            set.add(num);
        }
        System.out.println(set.size());
    }
}
