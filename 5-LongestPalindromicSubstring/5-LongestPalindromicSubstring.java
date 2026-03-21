// Last updated: 3/21/2026, 10:57:10 AM
1class Solution {
2    public int expand(String s, int left, int right) {
3        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
4            left--;
5            right++;
6        }
7        return right - left - 1;
8    }
9
10    public String longestPalindrome(String s) {
11        int left = 0, right = 0;
12        for(int i =0; i < s.length(); i++) {
13            int oddPalindrome = expand(s, i, i);
14            int evenPalindrome = expand(s, i, i+1);
15
16            if(right - left + 1 < oddPalindrome) {
17                left = i - oddPalindrome/2;
18                right = i + oddPalindrome/2;
19            }
20            if(right - left + 1 < evenPalindrome) {
21                left = i - (evenPalindrome/2 - 1);
22                right = i + (evenPalindrome/2 - 1) + 1;
23            }
24        }
25        return s.substring(left, right + 1);
26    }
27}