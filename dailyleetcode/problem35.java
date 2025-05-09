public class problem35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return left; // Insertion position
    }
    public static void main(String[] args) {
       int  nums[] = {1,3,5,6};
       int target = 5;
       System.out.println(searchInsert(nums,target)); 
    }
}
