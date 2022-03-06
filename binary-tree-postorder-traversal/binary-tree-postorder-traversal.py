# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        node=root
        res=[]
        self.preord(node,res)
        return res
    def preord(self,node,res):
        if node==None:
            return
        print(node.val)
        self.preord(node.left,res)
        self.preord(node.right,res)   
        res.append(node.val)
