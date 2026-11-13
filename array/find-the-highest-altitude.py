class Solution:
    def largestAltitude(self, gain: list[int]) -> int:
        altitudes = 0
        High_altitudes = 0
        for i in range(len(gain)):
            altitudes = altitudes + gain[i]
            High_altitudes = max(High_altitudes, altitudes)
        return High_altitudes