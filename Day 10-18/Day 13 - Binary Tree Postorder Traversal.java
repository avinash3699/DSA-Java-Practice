// Leetcode Problem Link: https://leetcode.com/problems/binary-tree-postorder-traversal/

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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root == null)
            return new ArrayList<>();
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        treeValues.add(root.val);
        
        return treeValues;
        
    }
}