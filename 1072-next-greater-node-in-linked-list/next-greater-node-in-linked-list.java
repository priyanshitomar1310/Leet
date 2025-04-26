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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        
        int max=0;
        while(temp!=null)
        {
        ListNode temp2=temp.next;
            max=0;
          while(temp2!=null)
          {
              if (temp2.val > temp.val) {
                    max = temp2.val;
                    break;
                    }
                 temp2=temp2.next;   
          } 
          list.add(max);
          temp=temp.next;  
        }
         int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}