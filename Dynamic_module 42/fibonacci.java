public class fibonacci {
    //O(n) using dp /  memoization 
    public static int Fib(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0){ // it means that the fibonacci of that number is already calculated
            return dp[n];
        }

        dp[n] =  Fib(n-1,dp) + Fib(n-2,dp);
        return dp[n];
    }

    // O(n) using tabulation
    public static int FibTab(int n, int dp[]){
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1]; // stores the fiboncci of each number , default - 0,0,0,0;
        System.out.println(Fib(n,dp));
        System.out.println(FibTab(n, dp));
    }
}
