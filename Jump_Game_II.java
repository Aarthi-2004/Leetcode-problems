class Solution {
    public int jump(int[] nums) {
     int high=0,end=0,count=0;
     for(int i=0;i<nums.length-1;i++){
         high=Math.max(high,i+nums[i]);
         if(i==end){
             count++;
             end=high;
        }
    }
     return count;
        
    }
}
