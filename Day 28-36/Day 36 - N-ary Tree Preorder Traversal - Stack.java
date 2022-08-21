// Leetcode Program Link: https://leetcode.com/problems/n-ary-tree-preorder-traversal/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

// Using Stack
class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> nodes = new ArrayList<>();
        
        if(root == null)
            return nodes;
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(stack.size() != 0){
            
            Node currNode = stack.peek();
            
            nodes.add(currNode.val);
            stack.pop();
            
            for(int index = currNode.children.size()-1; index >= 0; index--){
                stack.push(currNode.children.get(index));
            }
        }
        
        return nodes;
        
    }
    
}