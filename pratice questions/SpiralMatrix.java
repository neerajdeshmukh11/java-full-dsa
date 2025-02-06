public class SpiralMatrix {

    public static void Spiral(int matrix[][]) {
        int rows = matrix.length, cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int totalElements = rows * cols;
        int count = 0;

        while (count < totalElements) {
            // Left to Right
            for (int i = left; i <= right && count < totalElements; i++) {
                System.out.print(matrix[top][i] + " ");
                matrix[top][i] = Integer.MIN_VALUE; // Mark as visited
                count++;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom && count < totalElements; i++) {
                System.out.print(matrix[i][right] + " ");
                matrix[i][right] = Integer.MIN_VALUE;
                count++;
            }
            right--;

            // Right to Left
            for (int i = right; i >= left && count < totalElements; i--) {
                System.out.print(matrix[bottom][i] + " ");
                matrix[bottom][i] = Integer.MIN_VALUE;
                count++;
            }
            bottom--;
            // Bottom to Top
            for (int i = bottom; i >= top && count < totalElements; i--) {
                System.out.print(matrix[i][left] + " ");
                matrix[i][left] = Integer.MIN_VALUE;
                count++;
            }
            left++;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        Spiral(matrix);
    }
}
