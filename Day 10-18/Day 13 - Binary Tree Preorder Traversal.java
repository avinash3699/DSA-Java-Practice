// Leetcode Problem Link: https://leetcode.com/problems/binary-tree-preorder-traversal/

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
    
    List<Integer> treeValues = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null)
            return new ArrayList<>();
        
        treeValues.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return treeValues;
        
    }
}