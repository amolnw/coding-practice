// Last updated: 3/19/2026, 6:12:35 PM
1class Solution {
2    public int[] findBuildings(int[] heights) {
3        Stack<Integer> stack = new Stack<>();
4        for(int i = 0; i < heights.length; i++) {
5            while(!stack.isEmpty() && heights[stack.peek()] <= heights[i]) {
6                stack.pop();
7            }
8            stack.push(i);
9        }
10
11        int n = stack.size() - 1;
12        int[] result = new int[n + 1];
13        while(!stack.isEmpty()) {
14            result[n--] = stack.pop();
15        }
16
17        return result;
18    }
19}
20