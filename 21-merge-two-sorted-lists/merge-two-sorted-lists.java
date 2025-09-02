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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
        {
            return null;
        }
        if(list1!=null && list2==null)
        {
            return list1;
        }
        if(list2!=null && list1==null)
        {
            return list2;
        }
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
               temp.next=new ListNode(temp1.val);
               temp=temp.next;
               temp1=temp1.next;
            }
            else
            {
                temp.next=new ListNode(temp2.val);
                temp=temp.next;
                temp2=temp2.next;
            }
        }
       if(temp1!=null)
       {
          temp.next=temp1;
       }
       if(temp2!=null)
       {
         temp.next=temp2;
       }
        return dummy.next;
    }
}