//Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.
//Implement the Solution class:
//Solution(int[] nums) Initializes the object with the integer array nums.
//int[] reset() Resets the array to its original configuration and returns it.
//int[] shuffle() Returns a random shuffling of the array.

//Example 1:
//Input
//["Solution", "shuffle", "reset", "shuffle"]
//[[[1, 2, 3]], [], [], []]
//Output
//[null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]

class Solution {
  public Solution(int[] nums) {
     this.nums = nums;
     }
    public int[] reset() {
    return nums;
     }

    public int[] shuffle() {
    int[] arr = nums.clone();
    private void swap(int[] arr, int i, int j) {
     final int temp = arr[i];
     arr[i] = arr[j];
      arr[j] = temp;
    }
  }

    
