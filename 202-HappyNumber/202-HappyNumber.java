// Last updated: 3/21/2026, 6:44:16 PM
1class Solution {
2
3    private int getNext(int n) {
4        int totalSum = 0;
5        while(n > 0) {
6            int d = n % 10;
7            n = n/10;
8            totalSum += d * d;
9        }
10        return totalSum;
11    }
12    public boolean isHappy(int n) {
13        Set<Integer> seen = new HashSet<>();
14        while(n != 1 && !seen.contains(n)) {
15            seen.add(n);
16            n = getNext(n);
17        }
18        return n == 1;
19    }
20}