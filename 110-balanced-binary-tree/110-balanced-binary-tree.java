/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class balance{
    boolean bal = true;
    int ht  = -1;
}
class Solution {
     
    
    public boolean isBalanced(TreeNode root) {
        
        return isbalance(root).bal;
        
    }
    public balance isbalance(TreeNode root){
        if (root==null){
            return new balance();
        }
        
        balance left = isbalance(root.left);
        balance right = isbalance(root.right);
        
        balance selfB = new balance();
        selfB.ht = Math.max(left.ht,right.ht) +1;
        
        int differHt = Math.abs(left.ht-right.ht); // a binary tree in which the
        //left and right subtrees of every node differ in height 
        // by no more than 1.


        
        selfB.bal = left.bal && right.bal && differHt<=1;
        return selfB;
    }
}