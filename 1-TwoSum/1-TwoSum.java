// Last updated: 3/21/2026, 11:13:31 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer, Integer> hashMap = new HashMap<>();
4        for(int i = 0; i < nums.length; i++) {
5            if (hashMap.get(target - nums[i]) != null) {
6                return new int[]{hashMap.get(target - nums[i]), i};
7            }
8            else {
9                hashMap.put(nums[i], i);
10            }
11        }
12
13        return new int[]{-1,-1};
14    }
15}