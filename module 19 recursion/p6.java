// check if a given array is sorted or not

public class p6 {

    public static boolean IsSorted(int arr[],int i){// i is the start index
        if(i==arr.length-1){ // base case
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr, i+1);
    } 
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        System.out.println(IsSorted(arr,0));
    }
}
