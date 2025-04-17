public class q1{
    public static void main(String[] args) {
        int N = 3;
        int M = 4;

        int[][] sales = {
            {10, 20, 30, 40},
            {5, 25, 35, 45},
            {15, 18, 32, 38}
        };

        for(int i=0;i<M;i++){
            int maxRev = 0;
            for(int j=0;j<N;j++){
                if(sales[j][i] > maxRev){
                    maxRev = sales[j][i];
                }
            }
            System.out.println(maxRev+" ");
        }
    }
}