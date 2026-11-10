class Solution:
    def runningSum(self, nums: list[int]) -> list[int]:
        prefixsum = []
        prefixsum = [nums[0]]
        for i in range(1, len(nums)):
            prefixsum.append(prefixsum[i-1] + nums[i])
        return prefixsum