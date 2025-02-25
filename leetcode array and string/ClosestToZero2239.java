public class ClosestToZero2239 {

    public static int Closest(int nums[]){
        int mini = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            
            if(Math.abs(nums[i])<Math.abs(mini) || Math.abs(nums[i]) == Math.abs(mini) && nums[i]>mini){
                mini = nums[i];
            }
            
        }
        return mini;
    }
    public static void main(String[] args) {
        int nums[] = {2,-1,1};
        System.out.println(Closest(nums));
    }
}