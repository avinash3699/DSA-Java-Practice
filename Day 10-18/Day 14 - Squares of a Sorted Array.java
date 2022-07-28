// Leetcode Problem Link: https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int ptr1 = 0, ptr2 = nums.length-1;
        int result[] = new int[nums.length];
        
        for(int index = nums.length-1; index >= 0; index--){
            
            int num1 = Math.abs(nums[ptr1]), num2 = Math.abs(nums[ptr2]);
            
            if(num1 > num2){
                result[index] = num1 * num1;
                ptr1++;
            }
            else{
                result[index] = num2 * num2;
                ptr2--;
            }
            
        }
        
        return result;
        
    }
}