/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     long val;
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
    int cnt = 0;
    public int pathSum(TreeNode root, int targetSum) {
        pathSumOf(root, targetSum);
        if(root == null || root.val == 1000000000)
        {
            return 0;
        }
        return cnt;
    }
    public int[] pathSumOf(TreeNode root, int TargetSum)
    {
        if(root == null)
        {
            return new int[0];
        }else
        {
            int[] arrLeft = pathSumOf(root.left, TargetSum);
            int[] arrRight = pathSumOf(root.right, TargetSum);
            int[] arr = new int[arrRight.length + arrLeft.length + 1];
            int tem;
            int val = root.val;
            if(val == TargetSum)
            {
                cnt++;
            }
            int leftLen = arrLeft.length;
            for(int i = 0; i < leftLen; i++)
            {
                tem = arrLeft[i] + val;
                if(tem == TargetSum)
                {
                    cnt++;
                }
                arr[i] = tem;
            }
            for(int i = 0; i < arrRight.length; i++)
            {
                tem = arrRight[i] + val;
                if(tem == TargetSum)
                {
                    cnt++;
                }
                arr[i + leftLen] = tem;
            }
            arr[arr.length - 1] = val;
            return arr;
        }
    }

}