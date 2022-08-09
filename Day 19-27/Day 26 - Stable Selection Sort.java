// Leetcode Program Link: https://leetcode.com/problems/sort-an-array/

class Solution {
    public int[] sortArray(int[] array) {
            
        stableSelectionSort(array);
        return array;
        
    }
    
    public static void stableSelectionSort(int[] arr){
        
        int arrLength = arr.length;
        
        for(int ind1 = 0; ind1 < arrLength-1; ind1++){
            
            int minIndex = ind1;
            
            for(int ind2 = ind1+1; ind2 < arrLength; ind2++){
                
                if(arr[ind2] < arr[minIndex])
                    minIndex = ind2;
                
            }

            int value = arr[minIndex];
            
            while(minIndex > ind1){
                arr[minIndex] = arr[minIndex - 1];
                minIndex--;
            }
            
            arr[ind1] = value;
            
        }
        
    }
    
}