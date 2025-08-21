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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
        {
            return -1;
        }
        int min=root.val;
        long secondMin=Long.MAX_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode temp=q.remove();
                if (temp.val > min && temp.val < secondMin) {
                secondMin = temp.val; 
               }
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
        }
        return secondMin==Long.MAX_VALUE?-1:(int) secondMin;
       
    }
}