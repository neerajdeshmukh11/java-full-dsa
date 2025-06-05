
public class heapSort {

    public static void heapify(int arr[],int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left < size && arr[maxIdx]<arr[left]){
            maxIdx = left;
        }
        if(right < size && arr[maxIdx]<arr[right]){
            maxIdx = right;
        }

        if(maxIdx!=i){
            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }
    public static void HeapSort(int arr[]) {
        int n = arr.length;
        // step 1: build Maxheap
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Step 2: push largest at end
        for (int i = n - 1; i > 0; i--) {

            // swap largest/first idx with last idx
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        HeapSort(arr);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
