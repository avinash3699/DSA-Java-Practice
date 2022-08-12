// Leetcode Problem Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

// Leetcode Daily Challenge - 12/08/2022

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        int rootVal = root.val, pVal = p.val, qVal = q.val;
        
        if( (pVal < rootVal) && (qVal < rootVal) )
            return lowestCommonAncestor(root.left, p, q);
        
        else if( (pVal > rootVal) && (qVal > rootVal) )
            return lowestCommonAncestor(root.right, p, q);
        
        else
            return root;
    }
}