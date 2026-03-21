// Last updated: 3/21/2026, 3:31:37 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> hashSet = new HashSet<>();
4        for(int num: nums) {
5            hashSet.add(num);
6        }
7
8        int result = 0;
9        //Iterate over hashSet to avoid duplicates
10        for (int num : hashSet) { 
11            //Start of sequence
12            if (!hashSet.contains(num - 1)) {
13                int current = 1;
14                while(hashSet.contains(num + 1)) {
15                    current++;
16                    num++;
17                }
18
19                result = Math.max(result, current);
20            }
21        }
22        return result;
23    }
24}