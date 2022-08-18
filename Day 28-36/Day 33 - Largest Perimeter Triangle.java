// Leetcode Program Link: https://leetcode.com/problems/largest-perimeter-triangle/

class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int index = nums.length-3; index >= 0; index--){
            
            if(nums[index] + nums[index+1] > nums[index+2])
                return nums[index] + nums[index+1] + nums[index+2];
            
        }
        
        return 0;
        
    }
}