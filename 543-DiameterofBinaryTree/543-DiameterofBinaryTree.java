// Last updated: 3/17/2026, 2:33:30 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int diameter = 0;
18    private int dfs(TreeNode root) {
19        if(root == null) {
20            return 0;
21        }
22        int left = dfs(root.left);
23        int right = dfs(root.right);
24
25        //Max diameter
26        diameter = Math.max(diameter, left + right);
27
28        //Return max of left/right subtree + current node
29        return 1 + Math.max(left, right);
30    }
31
32    public int diameterOfBinaryTree(TreeNode root) {
33        dfs(root);
34        return diameter;
35    }
36}
37