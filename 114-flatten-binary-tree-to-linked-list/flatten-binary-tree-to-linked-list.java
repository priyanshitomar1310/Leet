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
    public void flatten(TreeNode root) {
       if(root==null)
       {
        return ;
       }  
       List<Integer> list=new ArrayList<>();
       helper(root,list);
        TreeNode dummy = new TreeNode(-1);
        TreeNode temp = dummy;
        for (int i=0;i<list.size();i++) {
            temp.right = new TreeNode(list.get(i));
            temp = temp.right;
        }
        root.val = dummy.right.val;
        root.left = null;
        root.right = dummy.right.right;
    }
   
    public void helper(TreeNode root,List<Integer> list)
    {
        if(root==null)
        {
            return ;
        }
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}