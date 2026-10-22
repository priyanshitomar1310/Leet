/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode indexOfCycle(ListNode slow, ListNode fast)
    {
        int index=0;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
            index++;
        }
        System.out.println("tail connects to node index "+index);
        return slow;
    }   
    public ListNode detectCycle(ListNode head) {
        ListNode slow,fast;
        slow=fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                return indexOfCycle(slow,fast);
            }
        }
        System.out.println("no cycle");
        return null;
    }
}