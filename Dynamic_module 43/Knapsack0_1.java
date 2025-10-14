

public class Knapsack0_1 {
    
    // recursion O(2^n exponential time)   
    public static int Knapsack(int val[], int wt[], int W, int n){
        if(W == 0 || n == 0){
            return 0;
        }

        if(wt[n-1]<=W){ //valid

            // include
            int ans1 = val[n-1] + Knapsack(val, wt, W-wt[n-1], n-1);

            // exclude
            int ans2 = Knapsack(val, wt, W, n-1);

            return Math.max(ans1, ans2);

        }else{
            return Knapsack(val, wt, W, n-1);
        }
    }
    // memoization O(n*W) time and space
     public static int Knapsack_memo(int val[], int wt[], int W, int n, int dp[][]){
        if(W == 0 || n == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){ //valid

            // include
            int ans1 = val[n-1] + Knapsack_memo(val, wt, W-wt[n-1], n-1, dp);

            // exclude
            int ans2 = Knapsack_memo(val, wt, W, n-1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }else{
            dp[n][W] = Knapsack_memo(val, wt, W, n-1, dp);
            return dp[n][W];
        }        
    }
    // tabulation 
    public static int knapsack_tab(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
         
        for(int i=0;i<dp.length;i++){ // 0th col 
            dp[i][0] = 0;

        }
        for(int j=0;j<dp[0].length;j++){ // 0th row
            dp[0][j] = 0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v = val[i-1]; //ith item ki value
                int w = wt[i-1]; // ith item ka wt

                if(w<=j){ // valid
                    int includeProfit = v + dp[i-1][j-w]; // include
                    int excludeProfit = dp[i-1][j];

                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                }else{ // invalid
                    int exProfit = dp[i-1][j];
                    dp[i][j] = exProfit;
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp [][] = new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(Knapsack(val, wt, W, val.length));
        System.out.println(Knapsack_memo(val, wt, W, val.length, dp));
        System.out.println(knapsack_tab(val, wt, W));
    }
}
