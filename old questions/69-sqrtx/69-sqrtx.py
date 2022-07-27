class Solution:
    def mySqrt(self, x: int) -> int:
        
        # https://www.youtube.com/watch?v=OxUFaTwKp7E
        
        left=0
        right =x
        if x<2:
            return x
        while (left<right):
            mid=(right+left)//2
            temp=x//mid
            if (mid==temp):
                return mid
            elif temp<=mid:
                right = mid
            else:
                left=mid+1
            
        return left-1
        