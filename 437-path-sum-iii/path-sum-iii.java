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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) 
        return 0;
        int pathsFromRoot = countPaths(root, targetSum);
        int pathsFromLeft = pathSum(root.left, targetSum);
        int pathsFromRight = pathSum(root.right, targetSum);
        return pathsFromRoot + pathsFromLeft + pathsFromRight;
    }
    public int countPaths(TreeNode root, long targetSum) {
        if (root == null) 
        return 0;
        int count = 0;
        if (root.val == targetSum) {
            count++;
        }
        count += countPaths(root.left, targetSum - root.val);
        count += countPaths(root.right, targetSum - root.val);
        return count;
    }
}
