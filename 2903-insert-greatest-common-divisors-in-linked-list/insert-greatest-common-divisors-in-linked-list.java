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
    public int GCD(int n,int m)
    {
        if(m==0)
        {
            return n;
        }
        return GCD(m,n%m);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        ListNode p=null;
        while(temp!=null && temp.next!=null)
        {
            ListNode newnode=new ListNode(GCD(temp.val,temp.next.val));
            p=temp.next;
            temp.next=newnode;
            newnode.next=p;
            temp=p;
        }
        return head;
    }
}