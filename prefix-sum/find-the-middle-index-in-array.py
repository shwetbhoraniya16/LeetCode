class Solution:
    def findMiddleIndex(self, nums: list[int]) -> int:
        sum = 0
        leftsum = 0
        for i in range(len(nums)):
            sum += nums[i]
        
        for i in range(len(nums)):
            rightsum = sum - leftsum - nums[i]
            if rightsum == leftsum:
                return i
            leftsum += nums[i]
        return -1