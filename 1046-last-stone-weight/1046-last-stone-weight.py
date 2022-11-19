import heapq
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stoneneg = [-s for s in stones]
        heapq.heapify(stoneneg)
        
        while len(stoneneg)>1:
            first=heapq.heappop(stoneneg)
            sec=heapq.heappop(stoneneg)
            if (sec>first):
                heapq.heappush(stoneneg,first-sec)
        stoneneg.append(0)
        return abs(stoneneg[0])