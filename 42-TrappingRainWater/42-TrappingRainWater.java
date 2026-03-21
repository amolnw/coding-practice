// Last updated: 3/20/2026, 8:55:08 PM
1class Solution {
2    public int trap(int[] height) {
3        Stack<Integer> stack = new Stack<>();
4        int result = 0;
5        for(int i = 0; i < height.length; i++) {
6            while(!stack.isEmpty() && height[i] > height[stack.peek()]) {
7                int top = stack.pop();
8                if ( stack.isEmpty() ) break;
9                int distance = i - stack.peek() - 1;
10                int max_height = Math.min(height[stack.peek()], height[i]) - height[top];
11                result += distance * max_height;
12            }
13            stack.push(i);
14        }
15        return result;
16    }
17}