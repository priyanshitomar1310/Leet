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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        getElements(root,list);
        return buildTree(list, 0, list.size() - 1);   
    }
     private TreeNode buildTree(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2; 
        TreeNode node = new TreeNode(list.get(mid));
        node.left = buildTree(list, start, mid - 1);
        node.right = buildTree(list, mid + 1, end);
        return node;
    }
    public void getElements(TreeNode root, List<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        getElements(root.left,list);
        list.add(root.val);
        getElements(root.right,list);
    }
}