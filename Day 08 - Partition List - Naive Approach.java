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
        
        ArrayList<Integer> arr1 = new ArrayList<>(), arr2 = new ArrayList<>();
        ListNode temp = head;
        
        while(temp != null){
            
            if(temp.val < x){
                arr1.add(temp.val);
            }
            else{
                arr2.add(temp.val);
            }
            
            temp = temp.next;
            
        }
        
        temp = head;
        arr1.addAll(arr2);
        int listIndex = 0;
        
        while(temp != null){
            
            temp.val = arr1.get(listIndex++);
            temp = temp.next;
            
        }
        
        return head;
        
    }
}