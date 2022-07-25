// Leetcode Problem Link: https://leetcode.com/problems/reverse-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev, curr, next;
        prev = null;
        next = null;
        curr = head;
        
        while(curr != null){
            
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
            
        }
        
        head = prev;
        
        return head;
        
    }
}