from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # Start from the last elements of nums1 and nums2
        i = m - 1  # Pointer for the last element in the first m elements of nums1
        j = n - 1  # Pointer for the last element in nums2
        k = m + n - 1  # Pointer for the last position in nums1 (entire array)

        # Merge nums2 into nums1 from the back
        while j >= 0:  # Continue until all elements in nums2 are merged
            # If nums1[i] > nums2[j], move nums1[i] to the current position k
            if i >= 0 and nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
            else:
                # Otherwise, move nums2[j] to the current position k
                nums1[k] = nums2[j]
                k -= 1
                j -= 1
