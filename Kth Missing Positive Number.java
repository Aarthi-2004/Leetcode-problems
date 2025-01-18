/**
 * Given an array `arr` of positive integers sorted in a strictly increasing order, and an integer `k`.
 *
 * Return the k-th positive integer that is missing from this array.
 *
 * Example:
 * Input: arr = [2, 3, 4, 7, 11], k = 5
 * Output: 9
 * Explanation:
 * The missing positive integers are [1, 5, 6, 8, 9, ...].
 * The 5th missing number is 9.
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Store all the numbers in the array into a set for quick lookup
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Count the missing numbers and find the k-th missing integer
        int count = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            // If the number is not in the set, it's missing
            if (!set.contains(i)) {
                count++;
                // If we've reached the k-th missing number, return it
                if (count == k) {
                    return i;
                }
            }
        }

        // This return is theoretically unreachable due to the infinite loop
        return -1;
    }
}
