class Solution {
    public int search(int[] arr, int searchElement) {
        
        int searchElementIndex = linearSearch(arr, searchElement);
        return searchElementIndex;
        
    }

    public static int linearSearch(int[] arr, int searchElement){

        int searchElementIndex = -1;

        for(int index = 0; index < arr.length; index++){
            if(arr[index] == searchElement){
                searchElementIndex = index;
                break;
            }
        }

        return searchElementIndex;

    }

}