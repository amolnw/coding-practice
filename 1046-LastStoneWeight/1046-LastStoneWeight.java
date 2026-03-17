// Last updated: 3/17/2026, 3:04:10 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
4        for(int stone: stones) {
5            maxHeap.offer(stone);
6        }
7
8        while(maxHeap.size() > 1) {
9            int first = maxHeap.poll();
10            int second = maxHeap.poll();
11
12            maxHeap.offer(Math.abs(first - second));
13        }
14
15        return maxHeap.peek();
16    }
17}
18