// Title: Linked List Cycle
// Difficulty: Easy
// Language: Java
// Link: https://leetcode.com/problems/linked-list-cycle/

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next.next;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            if ( fast == slow ) {
                hasCycle = true;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    }
    return hasCycle;
}
