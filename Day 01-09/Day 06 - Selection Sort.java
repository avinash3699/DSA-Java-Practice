class Solution {
    public int[] sortArray(int[] array) {
            
        selectionSort(array);
        return array;
        
    }
    
    public static void selectionSort(int[] arr){
        
        int arrLength = arr.length;
        
        for(int ind1 = 0; ind1 < arrLength-1; ind1++){
            
            int minIndex = ind1;
            
            for(int ind2 = ind1+1; ind2 < arrLength; ind2++){
                
                if(arr[ind2] < arr[minIndex])
                    minIndex = ind2;
                
            }
            
            if(minIndex != ind1)
                swap(arr, ind1, minIndex);
            
        }
        
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}