// Leetcode Problem Link: https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
     
        List<List<Integer>> values = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null)
            return values;
        
        queue.add(root);
        
        while(queue.size() != 0){
            
            List<Integer> tempList = new ArrayList<>();
            
            int SIZE = queue.size();
            
            for(int ctr = 1; ctr <= SIZE; ctr++){
                
                TreeNode node = queue.remove();
                tempList.add(node.val);
                
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
                
            }
            
            values.add(tempList);
            
        }
        
        return values;
        
    }
}