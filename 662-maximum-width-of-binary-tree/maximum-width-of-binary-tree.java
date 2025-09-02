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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) 
        return 0;
        Queue<Pair<TreeNode, Long>> q = new LinkedList<>();
        q.add(new Pair<>(root, 0L));
        int maxWidth = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            long firstIndex = q.peek().getValue(); 
            long lastIndex = firstIndex; 
            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Long> current = q.poll();
                TreeNode node = current.getKey();
                long index = current.getValue() - firstIndex; 
                if (i == size - 1)
                 lastIndex = index;
                if (node.left != null) 
                {
                    q.add(new Pair<>(node.left, 2 * index));
                }
                if (node.right != null) 
                {
                    q.add(new Pair<>(node.right, 2 * index + 1));
                }
            }
            maxWidth = Math.max(maxWidth, (int)(lastIndex + 1));
        }
        return maxWidth;
    }
}
