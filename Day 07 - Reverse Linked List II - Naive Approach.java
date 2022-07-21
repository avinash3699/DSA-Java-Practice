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

// Naive Approach
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if((head == null) || (head.next == null) || (left == right))
            return head;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode temp = head;
        int count = 1;
        
        while(temp != null){
            
            if((count >= left) && (count <= right)) 
                list.add(temp.val);
            
            if(count > right)
                break;
            
            temp = temp.next;
            count++;
            
            System.out.println(list);
        }
        
        int listIndex = list.size() - 1;
        
        temp = head;
        count = 1;
        
        System.out.print(list);
        
        while(temp != null){
            
            if((count >= left) && (count <= right)) 
                temp.val = list.get(listIndex--);
            
            if(count > right)
                break;
            
            temp = temp.next;
            count++;
            
        }
        
        return head;
        
    }
}