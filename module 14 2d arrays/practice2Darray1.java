// Print the number of 7's that are in the 2d array.

// Example
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2

public class practice2Darray1 {

    public static int Count(int numbers[][], int key) {
        int n = numbers.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (key == numbers[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int numbers[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 7;
        System.out.println(Count(numbers, key));
    }
}
