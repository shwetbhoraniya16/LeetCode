class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        l = 1
        r = 1
        while l < len(nums):
            if nums[l] != nums[l-1]:
                nums[r] = nums[l]
                r += 1
            l += 1
        return r