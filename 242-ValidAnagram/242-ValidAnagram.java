// Last updated: 3/21/2026, 11:32:37 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length())
4            return false; 
5
6        HashMap<Character, Integer> hashMap = new HashMap<>();
7        for(int i = 0; i < s.length(); i++) {
8            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
9        }
10
11        for(int i = 0; i < t.length(); i++) {
12            if (hashMap.get(t.charAt(i)) == null) {
13                return false;
14            }
15
16            hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
17            if ( hashMap.get(t.charAt(i)) < 0 )
18                return false;
19        }
20
21        return true;
22    }
23}