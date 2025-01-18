// Description:
// This program calculates the maximum product of the pair of integers from the given array, where the product is defined as 
// (nums[i] - 1) * (nums[j] - 1), for any two distinct indices i and j.
// The program uses a brute-force approach by iterating through all possible pairs of elements in the array to find the maximum product.
// Time Complexity: O(n^2), where n is the length of the array.
// Space Complexity: O(1), as no extra space is used apart from variables.

class Solution {
    public int maxProduct(int[] nums) {
        int ans = 0; // Variable to store the maximum product
        int n = nums.length; // Length of the input array

        // Iterate through all possible pairs of elements in the array
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                // Calculate the product for the current pair and update the maximum product
                ans = Math.max(ans, (nums[i] - 1) * (nums[j] - 1));
            }
        }

        return ans; // Return the maximum product found
    }
}
