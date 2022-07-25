class Solution {
    public int[] sortArray(int[] array) {
            
        bubbleSort(array);
        return array;
        
    }
    
    public static void bubbleSort(int[] arr){
        
        int arrLength = arr.length;
        boolean swapped = false;
        
        for(int ind1 = 0; ind1 < arrLength; ind1++){
            for(int ind2 = 0; ind2 < arrLength - ind1 - 1; ind2++){
                if(arr[ind2] > arr[ind2+1]){
                    swap(arr, ind2, ind2+1);
                    swapped = true;
                }
            }
            
            if(! swapped)
                break;
        }

    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}