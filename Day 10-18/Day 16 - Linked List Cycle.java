// Leetcode Problem Link: https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        Set<ListNode> nodeAddresses = new HashSet<>();
        
        ListNode temp = head;
        while(temp != null){
            
            if(nodeAddresses.contains(temp))
                return true;
            
            nodeAddresses.add(temp);
            
            temp = temp.next;
        }
        
        return false;
        
    }
}