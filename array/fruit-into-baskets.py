class Solution:
    def totalFruit(self, fruits: list[int]) -> int:
        l = 0
        map = {}
        maxlen = 0
        for r in range(len(fruits)):
            map[fruits[r]] = map.get(fruits[r], 0) + 1
            while len(map) > 2:
                map[fruits[l]] -= 1
                if map[fruits[l]] == 0:
                    del map[fruits[l]]
                l += 1
            maxlen = max(maxlen, r - l +1)
        return maxlen 
            