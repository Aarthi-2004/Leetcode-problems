// Description:
// The task is to find a peak element in a given integer array. A peak element is one that is strictly 
// greater than its neighbors. For the corner elements, we need to consider only one neighbor.
// The solution uses binary search to find a peak element efficiently in O(log n) time.

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        // Use binary search to narrow down the search space for the peak element
        while (left < right) {
            int mid = (left + right) >> 1;  // Find the middle element
            // If the middle element is greater than its next element, then the peak lies on the left half
            if (nums[mid] > nums[mid + 1]) {
                right = mid;  // Move the right pointer to mid
            } else {
                left = mid + 1;  // Otherwise, the peak lies on the right half, so move the left pointer
            }
        }
        
        // At the end, left will point to the peak element
        return left;
    }
}
