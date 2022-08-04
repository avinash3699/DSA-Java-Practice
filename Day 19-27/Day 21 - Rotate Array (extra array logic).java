// Leetcode Problem Link: https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
    
        if(nums.length == 1)
            return;
        if(nums.length < k)
            k %= nums.length;
        
        int[] extraArray = new int[nums.length];
        int extraIndex = 0;

        for(int index = nums.length - k; index < nums.length; index++)
            extraArray[extraIndex++] = nums[index];

        for(int index = 0; index < nums.length - k; index++)
            extraArray[extraIndex++] = nums[index];
        
        for(int index = 0; index < nums.length; index++)
            nums[index] = extraArray[index];
            
    }
}