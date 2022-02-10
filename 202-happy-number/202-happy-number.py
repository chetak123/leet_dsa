class Solution:
    def isHappy(self, n: int) -> bool:
        fast=self.square(n)
        slow=self.square(n)
        while (fast!=1):
            fast=self.square(self.square(fast))
            slow=self.square(slow)
            print (fast,slow)
            if fast==slow and fast!=1:
                return False
        return True
        
    def square(self,n):
        temp=0
        while (n!=0):
            i=n%10
            n=n//10
            temp=temp+(i*i)
        return temp
        
        