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
class Solution {
    public ListNode midNode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode right)
    {
        ListNode curr=right;
        ListNode prev=null;
        ListNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        {
            return;
        }
       ListNode mid=midNode(head);
       ListNode right=mid.next;
       mid.next=null;
       ListNode rightHead=reverse(right);
       ListNode temp=head;
       ListNode temp2=rightHead;
       ListNode left=temp.next;
       while(rightHead!=null && left!=null)
       {
          temp.next=rightHead;
          temp2=rightHead.next;
          rightHead.next=left;
          temp=left;
          rightHead=temp2;
          left=left.next;
       }
       if (rightHead != null) {
            temp.next = rightHead;
            rightHead.next = null;
        }
       
    }
}