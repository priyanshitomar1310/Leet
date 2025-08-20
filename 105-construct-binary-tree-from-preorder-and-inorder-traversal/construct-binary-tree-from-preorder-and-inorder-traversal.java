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
    int pi=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return binaryTree(preorder,inorder,0,inorder.length-1);
       
    }
    public TreeNode binaryTree(int[] pre,int[] in,int s,int e)
        {
        if(s>e)
        {
            return null;
        }
        TreeNode newNode=new TreeNode(pre[pi++]);
        int index=-1;
        for(int i=s;i<=e;i++)
        {
            if(newNode.val==in[i])
            {
                index=i;
                break;
            }
        }
        newNode.left=binaryTree(pre,in,s,index-1);
         newNode.right=binaryTree(pre,in,index+1,e);
         return newNode;
        }
    
}