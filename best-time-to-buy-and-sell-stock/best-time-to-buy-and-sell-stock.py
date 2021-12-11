class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit=0
        l=len(prices)
        s=prices[0]
        for i in range(l):
            if prices[i]<s:
                s=prices[i] # to find the smallest nmber in array
                
            elif ((prices[i]-s)>maxProfit): # to find the max diff wrt
                maxProfit=prices[i]-s
        return maxProfit
        
        
"""
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit=0
        l=len(prices)
        for i in range(l):
            k=i+1
            for j in range(k,l):
                Profit=prices[j]-prices[i]
                
                if (Profit>maxProfit):
                       maxProfit=Profit
        return(maxProfit)
"""