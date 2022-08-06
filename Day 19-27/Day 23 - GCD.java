// Leetcode Problem Link: https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class Solution {
    
    public int findGCD(int[] nums) {
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        for(int index = 0; index < nums.length; index++){    
            if(nums[index] < min) min = nums[index];
            if(nums[index] > max) max = nums[index];    
        }
        
        return gcd(min, max);
        
    }
    
    public static int gcd(int a, int b){
        
        if(a == 0)
            return b;
        
        return gcd(b%a, a);
    }
    
}