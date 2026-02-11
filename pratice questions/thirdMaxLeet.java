public class thirdMaxLeet {
    public static void main(String[] args) {
        int nums[] = { 2,2,3,1};
        System.out.println(thirdMax(nums)); // Output: 1
    }

    public static int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int n = nums.length;

        // find max1
        for (int i = 0; i < n; i++) {
            if (nums[i] > max1) {
                max1 = nums[i];
            }
        }

        // find max2 (must be < max1)
        boolean found2 = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] < max1 && nums[i] > max2) {
                max2 = nums[i];
                found2 = true;
            }
        }

        // find max3 (must be < max2)
        boolean found3 = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] < max2 && nums[i] > max3) {
                max3 = nums[i];
                found3 = true;
            }
        }

        return found3 ? max3 : max1;
    }
}
