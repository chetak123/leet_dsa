class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        x={}
        
        for i in nums:
            if i not in x.keys():
                x.update({i:1})
            else:
                x[i]+=1
        # the bellow lambda function converts key value to value key pair
        # it helps the sorted function to sort according to value and not key
        x_sort=sorted(x.items(),key=lambda kv:(kv[1],kv[0]))
        ans=[]
        for k in range(1,k+1):
            ans.append(x_sort[-k][0])
        return(ans)