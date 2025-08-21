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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> mainList=new ArrayList<>();
        if(root==null)
        return mainList;
        Queue<TreeNode> q=new LinkedList<>();
        Stack<Integer> stack1=new Stack<>();
         
        q.add(root);
        Boolean rev=false;
        while(!q.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            Stack<Integer> stack2=new Stack<>();
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode temp=q.remove();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                } 
                stack2.push(temp.val);
            }
            while(!stack2.isEmpty())
            {
                stack1.push(stack2.pop());
            }
            while(!stack1.isEmpty())
            {
                list.add(stack1.pop());
            }
            mainList.add(0,list);
        }
        return mainList;
    }
}