public class p2 {

    public static void PrintIncreasingOrder(int n){
        if(n==1){  // base case
            System.out.print(n+" ");
            return;
        }
        PrintIncreasingOrder(n-1); // recursive function as it in called in the function itself
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        PrintIncreasingOrder(n);
    }
}
