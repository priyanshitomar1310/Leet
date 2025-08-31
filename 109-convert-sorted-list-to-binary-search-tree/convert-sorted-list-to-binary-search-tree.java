/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list=new ArrayList<>();
        getElements(head,list);
        return BST(list,0,list.size()-1);
    }
    public TreeNode BST(List<Integer> list,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int mid=s+(e-s)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=BST(list,s,mid-1);
        root.right=BST(list,mid+1,e);
        return root;

    }
    public void getElements(ListNode head,List<Integer> list)
    {
        if(head==null)
        {
            return;
        }
        list.add(head.val);
        getElements(head.next,list);
    }
}