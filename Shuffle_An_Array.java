
class Solution {
  public Solution(int[] nums) {
     this.nums = nums;
     }
    public int[] reset() {
    return nums;
     }

    public int[] shuffle() {
    int[] arr = nums.clone();
…     private void swap(int[] arr, int i, int j) {
     final int temp = arr[i];
     arr[i] = arr[j];
      arr[j] = temp;
     }
    }

    
