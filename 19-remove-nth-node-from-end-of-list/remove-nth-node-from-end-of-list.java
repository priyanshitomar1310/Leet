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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp=head;
        // int size=0;
        // while(temp!=null)
        // {
        //     temp=temp.next;
        //     size++;
        // }
        // if(n==size)
        // {
        //     return head.next;
        // }
        // temp=head;
        // for(int i=0;i<size-n-1;i++)
        // {
        //     temp=temp.next;
            
        // }
        // if(temp.next!=null)
        // temp.next=temp.next.next;
        // return head;

        /* Optimised approach  */

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy,fast=head;
        int i=0;
        while(i<n)
        {
            fast=fast.next;
            i++;
        }
        while(fast!=null && slow.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next!=null)
        {
            slow.next=slow.next.next;
        }
        return dummy.next;
    }
}