// Last updated: 3/17/2026, 12:36:59 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if (head == null || head.next == null)
15            return null;
16
17        ListNode slow = head, fast = head.next.next;
18        boolean hasCycle = false;
19
20        while (fast != null && fast.next != null) {
21            if ( fast == slow ) {
22                hasCycle = true;
23                break;
24            }
25            slow = slow.next;
26            fast = fast.next.next;
27        }
28
29        int cycleLength = 1;
30        if (hasCycle) {
31            slow = slow.next;
32            while(fast != slow) {
33                slow = slow.next;
34                cycleLength++;
35            }
36
37            ListNode p1 = head, p2 = head;
38        
39            int cnt = 0;
40            while (cnt < cycleLength) {
41                p1 = p1.next;
42                cnt++;
43            }
44
45            while(p1 != p2) {
46                p1 = p1.next;
47                p2 = p2.next;
48            }
49
50            return p1;
51        }
52        return null;
53    }
54}