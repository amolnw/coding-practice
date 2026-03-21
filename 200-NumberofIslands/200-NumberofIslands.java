// Last updated: 3/21/2026, 1:56:38 PM
1class Solution {
2    private int find(int[] parent, int m) {
3        if(parent[m] != m) 
4            parent[m] = find(parent, parent[m]);
5        return parent[m];    
6    }
7    private void union(int[] parent, int m, int n) {
8        int parent1 = find(parent, m);
9        int parent2 = find(parent, n);
10
11        if (parent1 != parent2) 
12            parent[parent1] = parent2;
13        return;
14    }
15    
16    public int numIslands(char[][] grid) {
17        int m = grid.length;
18        int n = grid[0].length;
19        int[] parent = new int[m*n];
20        Arrays.fill(parent, -1);
21
22        for(int i = 0; i < m; i++) {
23            for(int j = 0; j < n; j++) {
24                if (grid[i][j] == '1') {
25                    parent[i*n+j] = i*n+j;
26                    if (i - 1 >=0 && grid[i-1][j] == '1') {
27                        union(parent, i*n+j, (i-1)*n+j);
28                    }
29                    if (j-1 >=0 && grid[i][j-1] == '1') {
30                        union(parent, i*n+j, i*n+(j-1));
31                    }
32                }
33            }
34        }
35
36        int count = 0;
37        for(int i = 0; i < parent.length; i++) {
38            if(parent[i] == i) {
39                count++;
40            }
41        }
42        return count;
43    }
44}