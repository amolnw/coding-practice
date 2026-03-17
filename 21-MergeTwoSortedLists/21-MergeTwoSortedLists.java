// Last updated: 3/17/2026, 2:02:50 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13
14        ListNode dummy = new ListNode();
15        ListNode newHead = dummy;
16        while(list1 != null && list2 != null) {
17            if(list1.val <= list2.val) {
18                dummy.next = list1;
19                list1 = list1.next;
20            }
21            else {
22                dummy.next = list2;
23                list2 = list2.next;
24            }
25
26            dummy = dummy.next;
27        }
28
29        if ( list1 == null )
30            dummy.next = list2;
31        else if ( list2 == null )
32            dummy.next = list1;
33        
34        return newHead.next;
35    }
36}