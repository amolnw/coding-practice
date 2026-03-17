// Last updated: 3/17/2026, 3:11:16 PM
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
17
18    boolean balanced = true;
19
20    private int height(TreeNode root) {
21        if(root == null) {
22            return -1;
23        }
24        return 1 + Math.max(height(root.left),height(root.right));
25    }
26
27    public boolean isBalanced(TreeNode root) {
28        if (root == null)
29            return true;
30
31        if (Math.abs(height(root.left) - height(root.right)) > 1)
32            return false;
33
34        return isBalanced(root.left) && isBalanced(root.right);      
35    }
36}