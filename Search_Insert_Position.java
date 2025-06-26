class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length;
        while(l<r){
            final int n=(l+r)/2;
        if(nums[n]==target)
            return n;
        if(nums[n]<target)
            l=n+1;
        else
            r=n;

            }
            return l;
        
    }
}
