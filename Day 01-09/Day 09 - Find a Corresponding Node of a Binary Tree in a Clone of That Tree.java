// Leetcode Problem Link: https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/

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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        if(cloned.val == target.val)
            return cloned;
        
        TreeNode leftNode, rightNode;
        
        if(cloned.left != null){
            leftNode = getTargetCopy(original, cloned.left, target);
            if(leftNode != null) return leftNode;
        }
        
        if(cloned.right != null){
            rightNode = getTargetCopy(original, cloned.right, target);
            if(rightNode != null) return rightNode;
        }
        
        return null;
    }
}