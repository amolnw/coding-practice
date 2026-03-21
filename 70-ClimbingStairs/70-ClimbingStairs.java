// Last updated: 3/21/2026, 4:19:35 PM
1class Solution {
2    public int climbStairs(int n) {
3
4        if (n == 1)
5            return 1;
6        int[] dp = new int[n+1];
7
8        dp[0] = 0;
9        dp[1] = 1;
10        dp[2] = 2;
11
12        for(int i = 3; i < n+1; i++) {
13            dp[i] = dp[i-1] + dp[i-2];
14        }
15
16        return dp[n];
17    }
18}