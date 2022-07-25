// Leetcode Problem Link: https://leetcode.com/problems/reverse-linked-list-ii/

// Leetcode Daily Challenge - 21/07/2022

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if((head == null) || (head.next == null) || (left == right))
            return head;
        
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        
        ListNode currLeft = dummyNode, prevLeft = null;
        
        for(int count = 0; count < left; count++){
            prevLeft = currLeft;
            currLeft = currLeft.next;
        }
        
        ListNode currRight = currLeft, prevRight = prevLeft, nextNode;
        for(int count = left; count <= right; count++){
            
            nextNode = currRight.next;
            currRight.next = prevRight;
            prevRight = currRight;
            currRight = nextNode;
            
        }
        
        currLeft.next = currRight;
        prevLeft.next = prevRight;
    
        return dummyNode.next;
        
    }
}