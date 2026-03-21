// Last updated: 3/21/2026, 12:22:26 PM
1class Solution {
2    public int minMeetingRooms(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
5
6        pq.offer(intervals[0]);
7        for(int i = 1; i < intervals.length; i++) {
8            if (intervals[i][0] >= pq.peek()[1]) {
9                int[] top = pq.poll();
10                top[1] = intervals[i][1];
11                pq.offer(top);
12            }
13            else {
14                pq.offer(intervals[i]);
15            }
16        }
17        return pq.size();
18    }
19}