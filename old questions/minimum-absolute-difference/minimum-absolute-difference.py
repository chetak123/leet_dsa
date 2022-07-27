class Solution(object):
    def minimumAbsDifference(self, arr):
        """
        :type arr: List[int]
        :rtype: List[List[int]]
        """
        new=[]
        arr.sort()
        diff=float('inf')
        l=len(arr)
        for i in range(l-1):
            diff=min(diff,arr[i+1]-arr[i])
        for i in range(l-1):
            if (arr[i+1]-arr[i]==diff):
                    ar1=[arr[i],arr[i+1]]
                    new.append(ar1)
        return new
            