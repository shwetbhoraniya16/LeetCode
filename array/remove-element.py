class Solution:
    def removeElement(self, nums: list[int], val: int) -> int:
        l = 0
        r = 0
        while l < len(nums):
            if nums[l] != val:
                nums[r] = nums[l]
                r += 1
            l += 1
        return r