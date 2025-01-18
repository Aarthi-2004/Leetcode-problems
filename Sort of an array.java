// Description:
// This program implements the QuickSort algorithm to sort an array of integers in ascending order.
// QuickSort is a divide-and-conquer algorithm that partitions the array around a pivot element and recursively sorts the subarrays.
// The `sortArray` method initializes the sorting process, and the `quickSort` method performs the sorting.
// Key features of this implementation:
// - Pivot selection is done using the middle element.
// - Two pointers (`i` and `j`) are used to partition the array.
// - The algorithm sorts the array in-place, reducing memory overhead.

class Solution {
    private int[] nums;

    public int[] sortArray(int[] nums) {
        this.nums = nums; // Assign the input array to a class variable for access in quickSort
        quickSort(0, nums.length - 1); // Start the QuickSort process
        return nums; // Return the sorted array
    }
        
    private void quickSort(int l, int r) {
        // Base case: If the left index is greater than or equal to the right, return
        if (l >= r) {
            return;
        }

        // Choose the middle element as the pivot
        int x = nums[(l + r) >> 1];

        // Initialize two pointers: i starts before the left boundary, j starts after the right boundary
        int i = l - 1, j = r + 1;

        // Partition the array
        while (i < j) {
            // Move the left pointer `i` forward until an element >= pivot is found
            while (nums[++i] < x) {
            }
            // Move the right pointer `j` backward until an element <= pivot is found
            while (nums[--j] > x) {
            }
            // If pointers haven't crossed, swap the elements at `i` and `j`
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }

        // Recursively apply QuickSort to the left and right partitions
        quickSort(l, j); // Left partition
        quickSort(j + 1, r); // Right partition
    }
}
