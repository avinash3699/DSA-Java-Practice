// Leetcode Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return null;
        
        ListNode prevNode = head, currNode = head;
        
        while(currNode != null){
            
            if(prevNode.val == currNode.val){
                currNode = currNode.next;
            }
            else{
                prevNode.next = currNode;
                prevNode = currNode;
            }
            
        }
        
        prevNode.next = null;
        
        return head;
        
    }
}