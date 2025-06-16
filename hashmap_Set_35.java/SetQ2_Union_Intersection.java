
import java.util.HashSet;

public class SetQ2_Union_Intersection {

    public static int Union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<arr1.length;i++){
                set.add(arr1[i]);
            }
            for(int i=0;i<arr2.length;i++){
                set.add(arr2[i]);
            }
            System.out.println(set);
            return set.size();
    }

    public static int Intersection(int arr1[], int arr2[]){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<arr1.length;i++){
                set.add(arr1[i]);
            }
            for(int i=0;i<arr2.length;i++){
                int num = arr2[i];
                if(set.contains(num)){
                    count++;
                    set.remove(num);
                }
            }
            System.out.println(set);
            return count;

    }


    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {3,9,6,2,9,4};

        System.out.println(Union(arr1, arr2));
        System.out.println(Intersection(arr1, arr2));
        
    }
}
