class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """   
    s={i for i in nums}
        print(len(nums))
        print(len(s))
        ans = len(s)
        nums=list(s)
        return ans
        """
        """
        :type nums: List[int]
        :rtype: int
        """
        nums[:] = sorted(list(set(nums)))
        return len(nums)