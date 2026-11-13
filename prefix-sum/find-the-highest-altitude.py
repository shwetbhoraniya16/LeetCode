class Solution:
    def largestAltitude(self, gain: list[int]) -> int:
        altitudes = 0
        High_altitudes = 0
        i = 0
        while i < len(gain):
            altitudes = altitudes + gain[i]
            High_altitudes = max(High_altitudes, altitudes)
            i += 1
        return High_altitudes