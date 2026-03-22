// Last updated: 3/22/2026, 1:20:15 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1, right = 1;
4        for(int pile: piles) {
5            right = Math.max(right, pile);
6        } 
7
8        while(left < right) {
9            int mid = ( left + right )/2;
10            int hoursNeeded = 0;
11
12            for(int pile: piles) {
13                hoursNeeded += Math.ceil((double) pile/mid);
14            }
15
16            if(hoursNeeded <= h) {
17                right = mid;
18            }
19            else {
20                left = mid + 1;
21            }
22        }
23
24        return right;
25    }
26}