// last occurance
public class p8 {

    public static int LastOccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccur(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 5, 7, 8, 9, 5 };
        System.out.println(LastOccur(arr, 6, 0));
    }
}
