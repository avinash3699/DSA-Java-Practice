// Leetcode Program Link: https://leetcode.com/problems/next-greater-element-i/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] arr = new int[nums1.length];
        int index = 0;
        
        for(int num1: nums1){
            
            boolean consider = false;
            int nextGreatestElement = -1;
            
            for(int num2: nums2){
                
                if(num2 == num1)
                    consider = true;
                else if((consider) && (num2 > num1)){
                    nextGreatestElement = num2;
                    break;
                }
                
            }
            
            arr[index++] = nextGreatestElement;
            
        }
        
        return arr;
        
    }
}