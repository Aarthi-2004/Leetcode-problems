class Solution {
    public int singleNumber(int[] nums) {
    int ans=0;
    for(final int num:nums)
    ans ^= num;//Bitwise operator to compare 0's and 1's
    return ans;    
    }
}
