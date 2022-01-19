class Solution:
    def CyclicSort(self,nums):
        """
        for i in range(len(nums)-1):
            corr=nums[i]-1
            if (nums[corr]!=nums[i]):
                nums[i],nums[corr]=nums[corr],nums[i]
                """
        i = 0
        while (i<(len(nums))):
            corr = nums[i]-1
            if ( nums[i]!=nums[corr]):
                
                nums[i],nums[corr]=nums[corr],nums[i]
            else:
                i=i+1
        return(nums)
        
    def findDuplicates(self, nums: List[int]) -> List[int]:
        num=self.CyclicSort(nums)
        ans=[]
        print(num)
        top=(self.CyclicSort([1,1,2]))
        print(top)
        an=[]
        for i in range(len(num)):
            if num[i]!=(i+1):
                ans.append(num[i])
        for i in range(len(top)):
            if top[i]!=(i+1):
                an.append(top[i])
        print(an)
        return(ans)
    
    