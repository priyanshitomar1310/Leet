/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
       {
          return null;
       }
       List<TreeNode> path1=new ArrayList<>();
       List<TreeNode> path2=new ArrayList<>();
       int i=1;
       getPath(root,p,path1);
       getPath(root,q,path2);
       for(;i<path1.size()&& i<path2.size();i++)
       {
           if(path1.get(i)!=path2.get(i))
           {
              break;
           }
       }
       return path1.get(i-1);
    }
    public boolean getPath(TreeNode root,TreeNode node,List<TreeNode> path)
       {
           if(root==null)
           {
            return false;
           }
           path.add(root);
           if(root==node)
           {
            return true;
           }
           boolean fl=getPath(root.left,node,path);
           boolean fr=getPath(root.right,node,path);
           if(fl || fr)
           {
            return true;
           }
           path.remove(path.size()-1);
           return false;
       }
}