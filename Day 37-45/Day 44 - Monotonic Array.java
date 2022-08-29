// Leetcode Program Link: https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] nums) {
        
        if(nums.length == 1 || nums.length == 2) return true;
        
        int incCount = 0, descCount = 0;
        
        for(int index = 0; index < nums.length - 1; index++){
            if(nums[index] <= nums[index+1])
                incCount++;
            if(nums[index] >= nums[index+1])
                descCount++;
        }
        
        return (incCount == nums.length-1) || (descCount == nums.length-1);
        
    }
}