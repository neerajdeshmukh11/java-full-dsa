public class p1{

    public static void printDecrOrder(int n){
        if(n==1){ // base case
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecrOrder(n-1); // recursive function as it in called in the function itself
    }
    public static void main(String[] args) {
        int n =10;
        printDecrOrder(n);
    }
}