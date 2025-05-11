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
import java.util.Arrays;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Arrays.sort(nums); // Sort the nums array so we can binary search

        ListNode dummy = new ListNode(0);
        ListNode temp2 = dummy;
        ListNode temp = head;

        while (temp != null) {
            if (Arrays.binarySearch(nums, temp.val) < 0) {
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        temp2.next = null; 
        return dummy.next;
    }
}
