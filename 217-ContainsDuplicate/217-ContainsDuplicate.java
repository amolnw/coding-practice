// Last updated: 3/21/2026, 6:54:47 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> hashSet = new HashSet<>();
4        for(int num: nums) {
5            if (hashSet.contains(num))
6                return true;
7            hashSet.add(num);    
8        }
9        return false;
10    }
11}