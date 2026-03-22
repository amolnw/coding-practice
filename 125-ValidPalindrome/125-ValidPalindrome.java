// Last updated: 3/21/2026, 11:44:34 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0, right = s.length() - 1;
4
5        while(left <= right) {
6            if( !Character.isLetterOrDigit(s.charAt(left)) ) {
7                left++;
8                continue;
9            }
10                
11            if ( !Character.isLetterOrDigit(s.charAt(right)) ) {
12                right--;
13                continue;
14            }
15
16            if (Character.toLowerCase(s.charAt(left)) 
17                    != Character.toLowerCase(s.charAt(right)) )
18                return false;
19
20            left++;
21            right--;    
22        }
23
24        return true;
25    }
26}