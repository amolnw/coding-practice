// Last updated: 3/21/2026, 2:13:51 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0, right = height.length - 1;
4        int result = 0;
5        while(left < right) {
6            int capacity = (right - left) * Math.min(height[left], height[right]);
7            result = Math.max(result, capacity);
8
9            if(height[left] < height[right])
10                left++;
11            else
12                right--;
13        }
14        return result;
15    }
16}