// Leetcode Problem Link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //O(n)
        Map<Integer, Integer> numsMap = new HashMap<>();
        
        for(int index = 0; index < nums.length; index++){
            
            if( numsMap.containsKey(target - nums[index]) )
                return new int[]{index, numsMap.get(target - nums[index])};
            
            numsMap.put(nums[index], index);
        }
        
        //O(n*n)
        // for(int ind1 = 0; ind1 < nums.length; ind1++){
        //     for(int ind2 = 0; ind2 < nums.length; ind2++){
        //         if( (ind1 != ind2) & (nums[ind1] + nums[ind2] == target) ){
        //             return new int[]{ind1, ind2};
        //         }
        //     }
        // }
        
        return new int[]{};
    }
}