public class MaxPairSumLeetcode {
    public static int maxSum(int[] nums) {
        int maxSum = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (maxDigit(nums[i]) == maxDigit(nums[j])) {
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        return maxSum;
    }

    // Helper function to find the maximum digit in a number
    private static int maxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            maxDigit = Math.max(maxDigit, num % 10);
            num /= 10;
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        int arr[] = { 2536, 1613, 3366, 162 };
        System.out.println("Max Pair Sum: " + maxSum(arr)); // Expected Output: 543
    }
}
