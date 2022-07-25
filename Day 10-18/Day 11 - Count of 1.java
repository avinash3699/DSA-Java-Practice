// Problem: Given a sorted array which only contains 0 and 1. Efficiently count the total number of 1s in it.

// Input: arr = [0, 0, 0, 0, 1, 1, 1, 1]
// Output: 4

// Input: arr = [1, 1, 1, 1, 1, 1]
// Output: 6

// Input: arr = [0, 0, 0, 0 ,0, 0]
// Output: 0

class solution {

    static int countOfOnes(int[] arr){

        int low = 0, high = arr.length - 1, mid, firstOnePosition = -1, countOfOnes;

        while(low < high){

            mid = low + ((high - low)/2);

            if( (mid == 0) && (arr[mid] == 1) ){
                firstOnePosition = mid;
                break;
            }

            else if( (arr[mid] == 0) && (arr[mid+1] == 1) ){
                firstOnePosition = mid+1;
                break;
            }

            else if( (arr[mid] == 1) && (arr[mid-1] == 0) ){
                firstOnePosition = mid;
                break;
            }

            else if( (arr[mid-1] == 1) && (arr[mid+1] == 1) )
                high = mid-1;

            else if( (arr[mid-1] == 0) && (arr[mid+1] == 0) )
                low = mid+1;

        }

        if(firstOnePosition == -1)
            return 0;

        return arr.length - firstOnePosition;

    }

}