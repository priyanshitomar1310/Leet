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
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) 
        return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty())
        {
            int size = q.size();
            List<TreeNode> nodes = new ArrayList<>();
            for (int i = 0; i < size; i++) 
            {
                TreeNode node = q.poll();
                if (level % 2 == 1) 
                { 
                    nodes.add(node);
                }
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            int l = 0, r = nodes.size() - 1;
            while (l < r) 
            {
                int tmp = nodes.get(l).val;
                nodes.get(l).val = nodes.get(r).val;
                nodes.get(r).val = tmp;
                l++;
                r--;
            }
            level++;
        }
        return root;
    }
}
