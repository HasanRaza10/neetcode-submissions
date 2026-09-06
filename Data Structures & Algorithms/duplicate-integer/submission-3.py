class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        rep = set()
        for num in nums:
            if num in rep:
                return True
            rep.add(num)
        return False