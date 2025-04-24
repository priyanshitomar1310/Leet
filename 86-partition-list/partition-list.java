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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode newHead = new ListNode(0);
        ListNode prev = newHead;
        ListNode p=head;
        while(p!=null)
        {
            if(p.val>=x)
            {
                temp.next=p;
                temp=temp.next;
            }
            else
            {
                prev.next=p;
                prev=prev.next;
            }
            p=p.next;
        }
        prev.next=dummy.next;
        temp.next=null;
       return newHead.next;
    }
}