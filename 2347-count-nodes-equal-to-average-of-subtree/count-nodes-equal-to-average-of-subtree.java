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
    int count=0;
    public int countNodes(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lc=countNodes(root.left);
        int rc=countNodes(root.right);
        return lc+rc+1;
    }
    public int sum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null)
        {
            return -1;
        }
        int nodes=countNodes(root);
        int s=sum(root);
        if(root.val==(s/nodes))
        {
           count++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return count;
    }
}