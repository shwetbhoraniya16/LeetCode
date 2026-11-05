class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        l = 0
        r = len(numbers) - 1
        currsum = 0
        while (l < r):
            currsum = numbers[l] + numbers[r]
            if currsum > target:
                r -= 1
            elif currsum < target:
                l += 1
            else:
                return [l + 1, r + 1]
        return []