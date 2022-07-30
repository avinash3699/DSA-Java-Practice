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
        
        ListNode slowPtr = head, fastPtr = head;
        
        while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null){
            
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            
            if(slowPtr == fastPtr)
                return true;
            
        }
        
        return false;
        
    }
}