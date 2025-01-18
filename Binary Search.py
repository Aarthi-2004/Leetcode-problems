from typing import List
import bisect

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # Use bisect_left to find the leftmost index where `target` can be inserted
        i = bisect.bisect_left(nums, target)
        
        # Check if the index is within bounds and the value at that index matches the target
        return -1 if i == len(nums) or nums[i] != target else i
