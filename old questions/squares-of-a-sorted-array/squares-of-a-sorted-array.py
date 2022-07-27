class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        """
        for i in range(len(nums)):
            nums[i]=nums[i]**2
        nums=nums.sort()
        return nums
        """
        lst=[i*i for i in nums]
        lst.sort()
        return lst