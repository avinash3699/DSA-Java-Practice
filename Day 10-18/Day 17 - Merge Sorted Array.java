// Leetcode Problem Link: https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int mPointer = m-1, nPointer = n-1, mergedArrayindex = m+n-1;
        
        while( (mPointer >= 0) && (nPointer >= 0) ){
            
            int mVal = nums1[mPointer], nVal = nums2[nPointer];
            
            if(mVal > nVal){
                nums1[mergedArrayindex--] = mVal;
                mPointer--;
            }
            else{
                nums1[mergedArrayindex--] = nVal;
                nPointer--;
            }
            
        }
        
        while(mPointer >= 0)
            nums1[mergedArrayindex--] = nums1[mPointer--];
        while(nPointer >= 0)
            nums1[mergedArrayindex--] = nums2[nPointer--];
        
    }
}