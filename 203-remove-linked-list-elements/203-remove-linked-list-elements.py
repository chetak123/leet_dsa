# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        """
        if head==None:
            return head
        node=head
        while (node.val==val):
            if (node != None or node.val!=val): # to check for condition 
                break                           # when head is val
            head=node.next
            node=head
        while (node!=None):
            if node.next.val==val:
                node.next=node.next.next
                
            node=node.next
        return head

        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        '''
        dummy_head = ListNode(-1) is creating a new node, and putting it in a variable called dummy_head. The new node has a value of -1.
        '''
        dummy_head = ListNode(-1)
        dummy_head.next = head
        
        current_node = dummy_head
        while current_node.next != None:
            if current_node.next.val == val:
                current_node.next = current_node.next.next
            else:
                current_node = current_node.next
                
        return dummy_head.next
    
'''
In order to save the need to treat the "head" as special, the algorithm uses a "dummy" head. This simplifies the code greatly, particularly in the case of needing to remove the head AND some of the nodes immediately after it.

Then, we keep track of the current node we're up to, and look ahead to its next node, as long as it exists. If current_node.next does need removing, then we simply replace it with current_node.next.next. We know this is always "safe", because current_node.next is definitely not None (the loop condition ensures that), so we can safely access its next.

Otherwise, we know that current_node.next should be kept, and so we move current_node on to be current_node.next.

The loop condition only needs to check that current_node.next != None. The reason it does not need to check that current_node != None is because this is an impossible state to reach. Think about it this way: The ONLY case that we ever do current_node = current_node.next in is immediately after the loop has already confirmed that current_node.next is not None.
'''        