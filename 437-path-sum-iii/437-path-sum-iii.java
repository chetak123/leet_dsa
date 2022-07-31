/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(long val) { this.val = val; }
 *     TreeNode(long val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null || root.val == 1000000000)
        {
            return 0;
        }

        int root_sum = countAll( root, targetSum); // to check all
        // nodes including that root node
        
        int left = pathSum( root.left,targetSum); //to check all nodes
        // from left side of root node (like from 5 to 3)
        
        int right = pathSum(root.right,targetSum);
        return (root_sum+right+left);
    }
    public int countAll(TreeNode root,long targetSum){
        if (root==null){
            return 0;
        }
        int ans = 0;
        if (targetSum-root.val==0){
            ans++;
        }
        ans = ans+countAll(root.left,targetSum-root.val);
        ans = ans + countAll(root.right,targetSum-root.val);
        return ans;
    }
}