public class secondMax {
    public static void main(String[] args) {
        int arr[] = {3, 10, 8, 9};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println("The 2nd maximum element is: "+max2);
    }
}
