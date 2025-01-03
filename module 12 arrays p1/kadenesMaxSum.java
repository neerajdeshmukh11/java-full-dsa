public class kadenesMaxSum {
    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i]; // Add the current element to currSum
            maxSum = Math.max(maxSum, currSum); // Update maxSum if currSum is greater
            if (currSum < 0) {
                currSum = 0; // Reset currSum to 0 if it becomes negative
            }
        }

        System.out.println("The Max Subarray Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3}; // Test case
        kadanes(numbers);
    }
}
