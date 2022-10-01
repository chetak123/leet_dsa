class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        let=len(s)-1
        letet=len(s)
        ra=letet//2
        k=0
        while k in range(ra):
            s[k] , s[let-k] = s[let-k], s[k]
            k=k+1
        
            
        