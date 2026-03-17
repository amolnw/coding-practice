// Last updated: 3/17/2026, 2:56:58 PM
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
18    private boolean isSameTree(TreeNode t1, TreeNode t2) {
19        if (t1 == null || t2 == null)
20            return t1 == t2;
21
22        if (t1.val != t2.val)
23            return false;
24
25        return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
26    }
27
28    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
29        if ( root == null )
30            return false;
31
32        if ( isSameTree(root, subRoot) )
33            return true;
34
35        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);    
36    }
37}