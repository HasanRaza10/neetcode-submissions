from collections import Counter
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # return sorted(s) == sorted(t)
        CountS = {}
        CountT = {}
        for i in range(len(s)):
            return Counter(s) == Counter(t)