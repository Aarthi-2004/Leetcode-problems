// Description:
// This program sorts an array containing only 0s, 1s, and 2s (representing colors: red, white, and blue) 
// in-place using the Dutch National Flag algorithm. The algorithm uses three pointers to sort the array 
// efficiently in O(n) time and O(1) space.
// 
// The idea is to partition the array into three segments:
// 1. Left segment containing all 0s.
// 2. Middle segment containing all 1s.
// 3. Right segment containing all 2s.
// 
// The sorting is achieved by iterating through the array and swapping elements into their correct segments.

// Class Definition
class Solution {
    public void sortColors(int[] nums) {
        int i = -1; // Pointer to mark the end of the 0s segment
        int j = nums.length; // Pointer to mark the start of the 2s segment
        int k = 0; // Pointer to iterate through the array

        // Iterate through the array until the middle segment is fully processed
        while (k < j) {
            if (nums[k] == 0) {
                // If the current element is 0, swap it into the 0s segment
                swap(nums, ++i, k++);
            } else if (nums[k] == 2) {
                // If the current element is 2, swap it into the 2s segment
                swap(nums, --j, k);
            } else {
                // If the current element is 1, simply move to the next element
                ++k;
            }
        }
    }

    // Helper function to swap elements at indices i and j
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
