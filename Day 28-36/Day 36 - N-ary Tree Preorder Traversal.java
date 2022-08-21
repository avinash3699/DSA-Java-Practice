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

class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> nodes = new ArrayList<>();
        
        if(root == null)
            return nodes;
        
        addNodes(root, nodes);
        
        return nodes;
        
    }
    
    public static void addNodes(Node root, List<Integer> nodes){
        
        if(root == null)
            return;
        
        nodes.add(root.val);
        
        for(Node child: root.children)
            addNodes(child, nodes);

    }
    
}