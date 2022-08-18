// Leetcode Program Link: https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        
        int ind = 0;
        
        for(int index = 0; index < nums.length; index++){
            
            if(nums[index] != 0)
                nums[ind++] = nums[index];
            
        }
        
        while(ind < nums.length)
            nums[ind++] = 0;
        
    }
}