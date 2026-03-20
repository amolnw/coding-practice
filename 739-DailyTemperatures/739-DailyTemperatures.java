// Last updated: 3/19/2026, 5:56:34 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        Stack <Integer> mStack = new Stack<>();
4        int[] result = new int[temperatures.length];
5        for (int i=0 ; i < temperatures.length; i++ ) {
6            int currentTemp = temperatures[i];
7            while(!mStack.isEmpty() && temperatures[mStack.peek()] < currentTemp) {
8                int prevDay = mStack.pop();
9                result[prevDay] = i - prevDay;
10            }
11            mStack.push(i);
12        }
13
14        return result;
15    }
16}
17