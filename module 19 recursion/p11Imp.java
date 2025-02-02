
//ways to tile the given board using the 2 x 1 tiles.
//(A tile can either be placed horizontally or vertically.)

public class p11Imp {
     
    public static int TilingProblem(int n){
        // Base Case

        if(n==0 || n==1){
            return 1;
        }
        // kaam

        // vertical
            int fnm1 = TilingProblem(n-1);
        // horzontal    
            int fnm2 = TilingProblem(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
        // or we can
        // return TilingProblem(n-1) + TilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(7));
    }
}
