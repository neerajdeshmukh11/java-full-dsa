// WAF to find the 1st occurance of an element in an array

public class p7 {

    public static int CheckOccur(int arr[], int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return CheckOccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,3,5,4,6,2,1};
        int key = 10;
        System.out.println(CheckOccur(arr, key, 0));
    }
}
