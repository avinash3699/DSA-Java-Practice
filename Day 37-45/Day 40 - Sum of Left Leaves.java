// Leetcode Program Link: https://leetcode.com/problems/sum-of-left-leaves/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        
        return getSum(root, false);
        
    }
    
    public static int getSum(TreeNode node, boolean leftNode){
        
        if(node == null) return 0;
        
        if(leftNode && (node.left == null) && (node.right == null))
            return node.val;
        
        int left = getSum(node.left, true);
        int right = getSum(node.right, false);
        
        return left + right;
        
    }
}