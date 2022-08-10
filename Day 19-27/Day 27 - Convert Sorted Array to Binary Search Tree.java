// Leetcode Problem Link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

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
    public TreeNode sortedArrayToBST(int[] nums) {
    
        return builtBinaryTree(nums, 0, nums.length - 1);
        
    }
    
    public TreeNode builtBinaryTree(int[] nums, int low, int high){
        
        if(low > high) return null;
        
        int mid = low + ( (high - low)/2 );
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = builtBinaryTree(nums, low, mid-1);
        root.right = builtBinaryTree(nums, mid+1, high);
        
        return root;
        
    }
}