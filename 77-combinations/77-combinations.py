class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res=[]
        def combi(start,comb):
            if (len(comb)==k):
                res.append(comb.copy())
                return
            for i in range(start,n+1):
                comb.append(i)
                combi(i+1,comb)
                comb.pop()
        combi(1,[])
        return res
        