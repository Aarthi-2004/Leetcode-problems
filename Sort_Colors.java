class Solution {
    public void sortColors(int[] nums) {
        int[] a=new int[3];
        for (int i:nums){
         a[i]++;
        }
        int index=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<a[i];j++){
              nums[index]=i;
              index++;
            }
        }
    }
}
