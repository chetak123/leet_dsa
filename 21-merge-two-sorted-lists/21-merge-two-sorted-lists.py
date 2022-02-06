# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        ll1,ll2=list1,list2
        head=lnew=ListNode(0)
        while (ll1!=None and ll2!=None):
            if ll1.val>ll2.val:
                lnew.next=ll2
                ll2=ll2.next
            else:
                lnew.next=ll1
                ll1=ll1.next
            lnew=lnew.next
        lnew.next=ll1 or ll2
        return head.next
            
        