// Print out the sum of the numbers in the second row of the "nums" array.

// Example
// Input - int[][] nums = { {1 ,49},{11,4,3},{2,2,3} };
// Output - 18

public class practice2darray2 {

    public static int Sum(int nums[][]){
        int sum = 0;
        int n = nums.length;
        for(int row =1;row<2;row++){
            for(int j=0;j<n;j++){
                sum+=nums[row][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] nums = { {1 ,4,9},{11,4,3},{2,2,3} };
        System.out.println(Sum(nums));
    }
}
