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
    int sum=0;
    public int findTilt(TreeNode root) {
        finalTilt(root);
        return sum;
    }
    public int finalTilt(TreeNode root)
    {
            if(root==null)
            {
                return 0;
            }
            int l=finalTilt(root.left);
            int r=finalTilt(root.right);
            int t=Math.abs(l-r);
            sum+=t;
            return root.val+l+r;
    }
    
}