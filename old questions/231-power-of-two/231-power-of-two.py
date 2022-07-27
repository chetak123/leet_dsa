class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        x=0
        #n=3
        ans=self.check(x,n)
        print(ans)
        return(ans)
    def check(self,x,n):
        y=2**x
        print(y)
        if y>n:
            return False
        elif (y==n):
            return True
        else:
            return self.check(x+1,n)
        