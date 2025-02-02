public class p10 {

    public static int OptimisedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = OptimisedPower(x, n/2)*OptimisedPower(x, n/2); 
         
        // if n is odd 
        if(n%2!=0){
            halfPower = x * halfPower;
        }
        return halfPower;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(OptimisedPower(x, n));
    }
}
