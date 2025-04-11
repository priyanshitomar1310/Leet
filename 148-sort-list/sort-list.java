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
    public ListNode mid(ListNode head)
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
    public ListNode mergeSort(ListNode l,ListNode r)
    {
        ListNode m=new ListNode(-1);
        ListNode temp=m;
        while(l!=null && r!=null)
        {
            if(l.val<r.val)
            {
                temp.next=l;
                l=l.next;
                temp=temp.next;
            }
            else
            {
                temp.next=r;
                r=r.next;
                temp=temp.next;
            }
        }
        while(l!=null)
        {
            temp.next=l;
            l=l.next;
            temp=temp.next;
        }
         while(r!=null)
        {
            temp.next=r;
            r=r.next;
            temp=temp.next;
        }
        return m.next;
    }
    public ListNode sortList(ListNode head) {
     if(head==null || head.next==null)
     {
        return head;
     }   
     ListNode left=mid(head);
     ListNode right=left.next;
     left.next=null;
     ListNode leftHead=sortList(head);
     ListNode rightHead=sortList(right); 
     return mergeSort(leftHead,rightHead);
    }
}