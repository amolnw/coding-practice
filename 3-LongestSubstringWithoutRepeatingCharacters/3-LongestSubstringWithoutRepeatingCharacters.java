// Last updated: 3/21/2026, 11:30:31 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int[] hashmap = new int[128];
4        Arrays.fill(hashmap, -1);
5        int result = 0;
6
7        int left = 0;
8        for(int right = 0; right < s.length(); right++) {
9            char current = s.charAt(right);
10            if (hashmap[current] != -1 && hashmap[current] >= left) {
11                left = hashmap[current] + 1;  
12            }
13            result = Math.max(result, right - left + 1);
14            hashmap[s.charAt(right)] = right;
15        }
16
17        return result;
18    }
19}