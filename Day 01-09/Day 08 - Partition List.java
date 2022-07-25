// Leetcode Problem Link: https://leetcode.com/problems/partition-list/

// Leetcode Daily Challenge - 22/07/2022

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
    public ListNode partition(ListNode head, int x) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = head, dummy1 = new ListNode(0), dummy2 = new ListNode(0);
        ListNode dummy1Head = dummy1, dummy2Head = dummy2;
        
        while(temp != null){
            
            if(temp.val < x){
                dummy1.next = temp;
                dummy1 = dummy1.next;
            }
            else{
                dummy2.next = temp;
                dummy2 = dummy2.next;
            }
            
            temp = temp.next;
            
        }
        
        dummy1.next = dummy2Head.next;
        dummy2.next = null;
        
        return dummy1Head.next;
        
    }
}