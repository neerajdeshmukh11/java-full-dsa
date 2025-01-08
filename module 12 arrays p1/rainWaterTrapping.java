public class rainWaterTrapping {

    public static int TrappingRainwater(int height[]) {

        int n = height.length;
        // create and storing the leftmax auxilairy array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        // create and storing the rightmax auxilairy array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        // loop for rainwater count
        int trappedRainWater = 0;
        for (int i = 0; i < n; i++) {

            // calculate the water level - min(leftmax,rightmax);
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // formula for trapped rain water - == waterlevel - height of bar
            trappedRainWater += waterlevel - height[i];
        }
        return trappedRainWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappingRainwater(height));
    }
}
