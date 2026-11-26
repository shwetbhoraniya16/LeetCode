class Solution:
    def canAliceWin(self, n: int) -> bool:
        num = 10
        alice = True
        while n >= num:
            n -= num
            num -= 1
            alice = not alice
        return not alice