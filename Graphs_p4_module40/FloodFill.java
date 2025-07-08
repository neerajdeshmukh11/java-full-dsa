import java.util.Arrays;

public class FloodFill {

    public static int[][] floodFill(int images[][], int sr, int sc, int color) {
        boolean visited[][] = new boolean[images.length][images[0].length];
        helper(images, sr, sc, color, visited, images[sr][sc]);
        return images;
    }

    public static void helper(int images[][], int sr, int sc, int color, boolean visited[][], int orgCol) {

        if (sr < 0 || sc < 0 || sr >= images.length || sc >= images[0].length || visited[sr][sc] || images[sr][sc] != orgCol) {
            return;
        }

        // Mark visited
        visited[sr][sc] = true;

        // Update the color
        images[sr][sc] = color;

        // Recursive calls in 4 directions
        helper(images, sr, sc - 1, color, visited, orgCol); // left
        helper(images, sr, sc + 1, color, visited, orgCol); // right
        helper(images, sr - 1, sc, color, visited, orgCol); // up
        helper(images, sr + 1, sc, color, visited, orgCol); // down
    }

    public static void main(String[] args) {
        int sr = 1, sc = 1, color = 2;
        int images[][] = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int[][] result = floodFill(images, sr, sc, color);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
