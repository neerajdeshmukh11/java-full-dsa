public class pairs {

    public static void Pair(int arr[],int s){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] ==s){
                    System.out.print("the pairs whose sum is "+s+" are "+"["+arr[i]+", "+arr[j]+"]");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,6,4,3};
        Pair(arr, 8);
    }
}
