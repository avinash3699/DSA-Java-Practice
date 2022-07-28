// Leetcode Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int listLen = 0;
        
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            listLen++;
        }
        
        //if only one node in list
        if(listLen == 1 && n == 1){
            return null;
        }

        //if first node should be removed
        else if((listLen - n - 1) == -1){
            head = head.next;
            return head;
        }
        
        temp = head;
        int count = 0;
        while(count++ < (listLen - n - 1))
            temp = temp.next;

        temp.next = temp.next.next;
        
        return head;
        
    }
}