class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);
        
        int currSum = 0, sumEqualsK = 0;
        
        for(int num: nums){
            
            currSum += num;
            
            sumEqualsK += sumMap.getOrDefault(currSum, 0);
            
            sumMap.put(currSum, sumMap.getOrDefault(currSum, 0) + 1);
            
        }
        
        return sumEqualsK;
        
    }
}