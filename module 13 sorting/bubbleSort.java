public class bubbleSort {

    public static void BubbleSorting(int arr[]){
        int n = arr.length;
        for(int turns = 0;turns<n-1;turns++){
            for(int j = 0;j<n-1-turns;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void PrintArray(int arr[]){
        int n = arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        BubbleSorting(arr);
        PrintArray(arr);
    }
}
