// Leetcode Program Link: https://leetcode.com/problems/sort-an-array/

class Solution {
    public int[] sortArray(int[] array) {
            
        insertionSort(array);
        return array;
        
    }
    
    public static void insertionSort(int[] arr){
        
        int arrLength = arr.length;
        
        for(int ind1 = 1; ind1 < arrLength; ind1++){
            
            int currValue = arr[ind1];
            int ind2 = ind1 - 1;
            
            while( (ind2 >= 0) && (arr[ind2] > currValue) ){
                
                arr[ind2+1] = arr[ind2];
                ind2--;
                
            }
            
            arr[ind2 + 1] = currValue;
            
        }
        
    }
    
}