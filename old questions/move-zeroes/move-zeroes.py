class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        
     #   for i in range(len(nums)-1):
     #       if nums[i]==0:
     #                nums[i],nums[i+1]=nums[i+1],nums[i]

        for i in range(0,len(nums)-1):
            for j in range(len(nums)-1):  
                if(nums[j]==0):
                                              performed using bubble sort 
                   # temp = list1[j]            but time limit exceeded
                   # list1[j] = list1[j+1]  
                   # list1[j+1] = temp
                    
                    nums[j],nums[j+1]=nums[j+1],nums[j]
                    
"""            
        count = 0
        while 0 in nums:
            count += 1
            nums.remove(0)
        
        while count > 0:
            nums.append(0)
            count -= 1
