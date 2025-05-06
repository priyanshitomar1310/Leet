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

    public ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode mid = midNode(head);
        ListNode reversedRight = reverse(mid);
        ListNode temp = reversedRight;  
          ListNode left = head;
        boolean isPalindrome = true;
        while (reversedRight != null) {
            if (left.val != reversedRight.val) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            reversedRight = reversedRight.next;
        }
        reverse(temp);

        return isPalindrome;
    }
}
