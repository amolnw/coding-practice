// Last updated: 3/22/2026, 12:03:31 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for(int i = 0; i < s.length(); i++) {
5            char current = s.charAt(i);
6            if (current == '(' || current == '{' || current == '[')
7                stack.push(current);
8            else if ((current == ')' && !stack.isEmpty() && stack.peek() == '(')
9                || (current == '}' && !stack.isEmpty() && stack.peek() == '{')
10                || (current == ']' && !stack.isEmpty() && stack.peek() == '[')) {
11                stack.pop();
12            }     
13            else {
14                return false;
15            }
16        }
17
18        return stack.size() == 0;
19    }
20}