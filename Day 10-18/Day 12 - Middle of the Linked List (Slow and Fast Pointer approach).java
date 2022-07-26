// Leetcode Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// Slow, Fast Pointer Approach

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
    public ListNode middleNode(ListNode head) {
        
        ListNode slowPointer = head, fastPointer = head;
        
        while( (fastPointer != null) && (fastPointer.next != null)){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        
        return slowPointer;
        
    }
}