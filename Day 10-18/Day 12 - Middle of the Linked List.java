// Leetcode Problem Link: https://leetcode.com/problems/middle-of-the-linked-list/

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
        
        ListNode temp = head;
        int listLength = 0;
        
        while(temp != null){
            listLength++;
            temp = temp.next;
        }
        
        int middleIndex = listLength/2;
        
        temp = head;
        
        while(middleIndex-->0){
            temp = temp.next;
        }
        
        return temp;
        
    }
}