class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0];
        int maxsum =nums[0];
          for(int i=1;i<nums.length;i++){
            int num = nums[i];
          if(currentsum <0){
            currentsum = num;
            }
          else{
            currentsum = currentsum+num;
             }
          if(currentsum>maxsum){
             maxsum = currentsum;
             }
          }
          return maxsum;
    }
}
