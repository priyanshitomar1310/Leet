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
    public void reverse(ListNode leftHead,ListNode rightHead)
    {
        ListNode curr=leftHead;
        ListNode prev=rightHead;
        ListNode next;
        while(curr!=rightHead)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right)
        return head;
        int i=1,j=1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftHead=dummy;
        
        while(i<left)
        {
            leftHead=leftHead.next;
            i++;
        }
        ListNode newLeft=leftHead.next;
        ListNode rightHead=newLeft;
        while(j<right- left + 1)
        {
            rightHead=rightHead.next;
            j++;
        }
        ListNode afterRight = rightHead.next;
        reverse(newLeft,afterRight);
        leftHead.next = rightHead;
        newLeft.next = afterRight;
        return dummy.next;
    }
}