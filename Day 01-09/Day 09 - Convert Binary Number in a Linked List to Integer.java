// Leetcode Problem Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

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
    public int getDecimalValue(ListNode head) {
        
        ListNode temp = head;
        String binary = "";
        
        while(temp != null){
            
            binary += temp.val + "";
            temp = temp.next;
            
        }
        
        return Integer.parseInt(binary, 2);
        
    }
}