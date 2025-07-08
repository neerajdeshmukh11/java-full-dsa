
import java.util.Arrays;

// concept is fibonacci

public class ClimbingStairs {

    // using recursion TC = O(2^n) 
    public static int ClimbRecur(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;

        return ClimbRecur(n - 1) + ClimbRecur(n - 2);
    } 

    // using memoization TC = O(n)
    public static int ClimbMemo(int n, int ways[]) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;

        if(ways[n]!=-1){  // n is already calculated
            return ways[n];
        }

        ways[n] =  ClimbMemo(n - 1, ways) + ClimbMemo(n - 2, ways);
        return ways[n];
    } 

    // Using Tabulation TC = O(n)
        public static int ClimbTab(int n){

            int dp[] = new int[n+1];

            dp[0] = 1;

            for(int i=1;i<=n;i++){
                if(i == 1){
                    dp[i] = dp[i-1] + 0;
                }else{
                    dp[i] = dp[i-1] + dp[i-2]; 
                }
            }
            return dp[n];
        }
        
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
       
        // System.out.println(ClimbRecur(n));
        // System.out.println(ClimbMemo(n, ways));
        System.out.println(ClimbTab(n));
    }
}
