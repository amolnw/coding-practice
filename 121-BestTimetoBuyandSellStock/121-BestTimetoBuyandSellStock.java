// Last updated: 3/21/2026, 11:41:45 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[] maxTillNow = new int[prices.length];
4        int max = 0;
5        for(int i = prices.length - 1; i >= 0; i--) {
6            max = Math.max(max, prices[i]);
7            maxTillNow[i] = max;
8        }
9
10        int result = 0;
11        for(int i = 0; i < prices.length; i++) {
12            result = Math.max(result, maxTillNow[i] - prices[i]);
13        }
14
15        return result;
16    }
17}