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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++)
        {
            root=createBST(root,preorder[i]);
        }
        return root;
    }
    public TreeNode createBST(TreeNode root,int data)
    {
        if(root==null)
        {
            return new TreeNode(data);
        }
        if(data<root.val)
        {
            root.left=createBST(root.left,data);
        }
        else
        {
            root.right=createBST(root.right,data);
        }
        return root;
    }
}