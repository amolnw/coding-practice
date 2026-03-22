// Last updated: 3/21/2026, 7:31:44 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4        for(int num: nums) {
5            result ^= num; 
6        }
7        return result;
8    }
9}
10
11
12
13