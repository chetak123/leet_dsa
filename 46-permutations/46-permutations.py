class Solution:
    def permute(self, nums):
        res=[]
        res=self.help([],nums)
        print(res)
        return res
        
        
    def help(self,proc,arr):
        if (len(arr)==0):
            #print(proc)
            list1=[]
            list1.append(proc)
            return list1
        temp=arr[0]
        ans=[]
        for i in range(0,len(proc)+1):
            first=proc[0:i]
            last=proc[i:]
            first.append(temp)
            first.extend(last)
            ans.extend(self.help(first,arr[1:]))
        return ans