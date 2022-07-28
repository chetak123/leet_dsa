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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.right,root.left);
    }
    public boolean mirror(TreeNode a,TreeNode b){
        if (a==null && b==null){
            return true;
        }
        // (a.val==b.val)
          //return true;
        //
        if (a==null || b==null){
            return false;
        }
        if (a.val != b.val){
            return false;
        }
        boolean left = mirror(a.right,b.left);
        boolean right = mirror(a.left,b.right);
        
        return left && right;
    }
}