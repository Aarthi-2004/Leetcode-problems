class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a=new int[nums.length];
        for (int i=0;i<nums.length;i++){
         int c=0;
         for (int j=0;j<nums.length;j++){
         if(nums[i]>nums[j]){
            c+=1;
        }
    }
      a[i]=c;
    }
      return a;
        
    }
}
