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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1== null && l2==null)
        {
            return null;
        }
        if(l1==null)
        {
            return l2;
        }
        if(l2==null)
        {
            return l1;
        }
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        ListNode t1=l1;
        ListNode t2=l2;
        while(t1!=null)
        {
            s1.push(t1.val);
            t1=t1.next;
        }
        while(t2!=null)
        {
            s2.push(t2.val);
            t2=t2.next;
        }
        int c=0;
        ListNode res=null;
        while(!s1.isEmpty() || !s2.isEmpty()||c>0)
        {
            int a = s1.isEmpty() ? 0 : s1.pop();
            int b = s2.isEmpty() ? 0 : s2.pop();
            int sum=a+b+c;
            c= sum / 10;
            int digit = sum % 10;
            ListNode node=new ListNode(digit);
             node.next = res;
            res = node;
        }
       
        return res;
    }
}