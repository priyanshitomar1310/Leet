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
    public int maxLevelSum(TreeNode root) {
        int level=0;
        int maxLevel=1;
        int maxSum=Integer.MIN_VALUE;
        if(root==null)
        {
            return -1;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int sum=0;
            int s=q.size();
            level++;
            for(int i=0;i<s;i++)
            {
                TreeNode temp=q.remove();
                sum+=temp.val;
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }
            
        }
            return maxLevel;
    }
}