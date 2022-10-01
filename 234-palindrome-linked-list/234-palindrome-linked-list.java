/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    ListNode ref; // global variable
        
    public boolean isPalindrome(ListNode head) {
        
        // Recursive Soluntion
        ref = head;
        return check(head);
        
    }
    public boolean check(ListNode node){
        if (node==null){
            return true;
        }
        boolean ans = check(node.next);
       // if (ref.val==node.val){
       //     boolean compAns = true;
       // }else{
       //     boolean compAns=false;
       // }
        boolean isEqual = (ref.val == node.val)? true : false; 

        ref=ref.next;
        return ans && isEqual;
    }
}