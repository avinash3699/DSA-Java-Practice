// Leetcode Problem Link: https://leetcode.com/problems/maximum-subarray/
// Explanation (Tamil): https://www.youtube.com/watch?v=wECSIm5xTRE

class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0], currSum = nums[0];
        
        for(int index = 1; index < nums.length; index++){
            
            if(currSum < 0)
                currSum = nums[index];
            else
                currSum += nums[index];
            
            maxSum = (maxSum > currSum) ? maxSum : currSum;
            
        }
        
        return maxSum;
        
    }
}