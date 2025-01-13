public class diagonalSum {

    public static int DiagonalSum(int matrix[][]){
        int sum =0;
        int n = matrix.length;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j ==n-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        System.out.println(DiagonalSum(matrix)); 
    }
}
