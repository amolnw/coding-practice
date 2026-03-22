// Last updated: 3/21/2026, 10:38:53 PM
1class Solution {
2    public boolean canAttendMeetings(int[][] intervals) {
3        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
4        for(int i = 0; i < intervals.length; i++) {
5            if ( i == 0 )
6                continue;
7            
8            if (intervals[i][0] < intervals[i-1][1])
9                return false;
10        }
11        return true;
12    }
13}