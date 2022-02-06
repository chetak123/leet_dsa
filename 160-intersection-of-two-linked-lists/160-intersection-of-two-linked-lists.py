# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        if headA is None or headB is None:
            return None

        pa = headA # 2 pointers
        pb = headB

        while pa is not pb:
            # if either pointer hits the end, switch head and continue the second traversal, 
            # if not hit the end, just move on to next
            pa = headB if pa is None else pa.next # this is used to concatinate A+B
            pb = headA if pb is None else pb.next # and B+A thus solving the problem
                                                  # of uneven lengths
        return pa # only 2 ways to get out of the loop, they meet or the both hit the end=None

# the idea is if you switch head, the possible difference between length would be countered. 
# On the second traversal, they either hit or miss. 
# if they meet, pa or pb would be the node we are looking for, 
# if they didn't meet, they will hit the end at the same iteration, pa == pb == None, return either one of them is the same,None            
            
"""
        l1,l2=headA,headB
        c1,c2=self.count(l1,l2)
        
        if (c1>c2):
            d=c1-c2
            return (self.inter(d,l1,l2))
        else:
            d=c2-c1
            return (self.inter(d,l2,l1))
    
    def inter(self,d,l1,l2):
        i=0
        while i in range(d):
            if (l1==None):
                return 0
            i+=1
            l1=l1.next
        while(l1 and l2):
            if l1.val==l2.val:
                ans=l1.val
                return (ans)
            l1=l1.next
            l2=l2.next
        return 0
        
            
    def count(self,l1,l2):
        c1=0
        c2=0
        while(l1):
            c1+=1
            l1=l1.next
        while(l2):
            c2+=1
            l2=l2.next
        return(c1,c2)
"""
        
        
"""
        curA,curB = headA,headB
        lenA,lenB = 0,0
        while curA is not None:
            lenA += 1
            curA = curA.next
        while curB is not None:
            lenB += 1
            curB = curB.next
        curA,curB = headA,headB
        if lenA > lenB:
            for i in range(lenA-lenB):
                curA = curA.next
        elif lenB > lenA:
            for i in range(lenB-lenA):
                curB = curB.next
        while curB != curA:
            curB = curB.next
            curA = curA.next
        return curA
"""


