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
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode node)
    {
        ListNode prev=null,curr=node;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        if(head==null)
        {
            return 0;
        }
        if(head.next==null)
        {
            return head.val;
        }
        if(head.next.next==null)
        {
            return head.val+head.next.val;
        }
        ListNode mid=midNode(head);
        ListNode secondList=reverse(mid.next);
        ListNode temp=head;
        int maxSum=Integer.MIN_VALUE;
        while(secondList!=null)
        {
            int sum=temp.val+secondList.val;
            if(sum>maxSum)
            {
                maxSum=sum;
            }
            temp=temp.next;
            secondList=secondList.next;
        }
        return maxSum;
    }
}