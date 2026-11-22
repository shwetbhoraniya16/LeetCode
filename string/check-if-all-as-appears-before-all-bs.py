class Solution:
    def checkString(self, s: str) -> bool:
        count = 0
        if s[0] == 'b' and 'a' not in s:
            return True
        elif s[0] == 'b':
            return False
        
        for i in range(1, len(s)):
            if s[i-1] != s[i]:
                count += 1
            if count == 2:
                return False
        return True