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
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        List<Integer> list=new ArrayList<>();
        getElements(root,list);
        return greaterTree(root,list);
    }
    public TreeNode greaterTree(TreeNode root,List<Integer> list)
    {
        if(root==null)
        {
            return root;
        }
        int temp=root.val;
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>=temp)
            {
                sum+=list.get(i);
            }
        }
        root.val=sum;
        greaterTree(root.left,list);
        greaterTree(root.right,list);
        return root;
    }
    public void getElements(TreeNode root,List<Integer> list)
    {
        if(root==null)
        {
            return ;
        }
        list.add(root.val);
        getElements(root.left,list);
        getElements(root.right,list);
    }
}