class Solution {
    public int[] runningSum(int[] nums) {
        int r=0;
        for(int i=0;i<nums.length;i++){
              r+=nums[i];
               nums[i]=r;
        }
        return nums;
    }
}
