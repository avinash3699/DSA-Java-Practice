// Leetcode Program Link: https://leetcode.com/problems/sign-of-the-product-of-an-array/

class Solution {
    public int arraySign(int[] nums) {
        
        int countNegative = 0;
        boolean isZero = false;
        for(int num: nums){
            if(num == 0){
                return 0;
            }
            else if(num < 0)
                countNegative++;
        }
        
        if( (countNegative&1) == 1 )
            return -1;
        return 1;
        
    }
}