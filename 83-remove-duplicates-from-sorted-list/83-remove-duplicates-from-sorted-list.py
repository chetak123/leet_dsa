# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        l1=head
        while(l1):
            if l1.next!=None and l1.val==l1.next.val:
                print(l1.val,l1.next)
                l1.next=l1.next.next
          #  if l1.next!=None:
           #     
           #     print(l1.val,l1.next.val)
            else:
                l1=l1.next
        return head
        