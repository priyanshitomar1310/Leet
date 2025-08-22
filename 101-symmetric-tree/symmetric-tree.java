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
import java.util.*;

class Solution {
    private boolean isSame(List<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            if (!Objects.equals(list.get(i), list.get(j))) 
            return false;
            i++;
             j--;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
         return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int s = q.size();
            List<Integer> level = new ArrayList<>(s * 2);
            for (int i = 0; i < s; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null) 
                { 
                    level.add(temp.left.val);
                    q.add(temp.left);
                }
                else 
                level.add(null);   
                if (temp.right != null) 
                { 
                    level.add(temp.right.val);
                    q.add(temp.right); 
                }
                else
                level.add(null);   
            }
            if (!isSame(level))
             return false;
        }
        return true;
    }
}
