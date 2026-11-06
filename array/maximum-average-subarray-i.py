class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        sum = 0
        for i in range(k):
            sum = sum + nums[i]
        maxsum = sum
        for i in range(k, len(nums)):
            sum = sum - nums[i- k] + nums[i]
            maxsum = max(sum, maxsum)
        return maxsum/k