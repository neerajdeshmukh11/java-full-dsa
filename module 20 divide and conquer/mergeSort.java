
public class mergeSort {

    public static void MergeSort(int arr[], int si, int ei) {

        // base case

        if (si >= ei) {
            return;
        }

        // kaam

        int mid = si + (ei - si) / 2; // or (si+ei)/2
        MergeSort(arr, 0, mid);// left part
        MergeSort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // left(0,3) = 4 & right(4,6) = 3 --> (3-0+1) + (6-4+1) ==7
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // interator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part mein agar kuchh bacha hai
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part mein agar kuchh bacha hai
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp array to org arr

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, -2, 2, 8 };
        MergeSort(arr, 0, arr.length - 1);
        PrintArray(arr);
    }
}