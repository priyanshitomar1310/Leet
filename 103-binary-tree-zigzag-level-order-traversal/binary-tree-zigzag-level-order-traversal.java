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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> mainList=new ArrayList<>();
        if(root==null)
        return mainList;
        Queue<TreeNode> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        q.add(root);
        Boolean rev=false;
        while(!q.isEmpty())
        {
            int si=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<si;i++)
            {   
                TreeNode temp = q.remove();
                if(rev)
                {
                    s.push(temp.val);
                }
                else
                list.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                } 
            }
            if(rev)
                {
                    while(!s.isEmpty())
                    {
                        list.add(s.pop());
                    }
                } 
            mainList.add(list);
             rev=!rev;
        }
        return mainList;
    }
}