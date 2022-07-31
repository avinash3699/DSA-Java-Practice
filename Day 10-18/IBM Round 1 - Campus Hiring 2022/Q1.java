// Given an array 'arr'. Print the sum of prime numbers in it.

// Input: arr = [2, 3, 5, 7, 11]
// Output: 28
// Explanation: All the elements of array 'arr' are prime numbers. 
//              Hence, the sum becomes 2 + 3 + 5 + 7 + 11 = 28 

// Input: arr = [1, 2, 3, 4, 5, 6, 7]
// Output: 17
// Explanation: The prime numbers in array 'arr' are 2, 3, 5, 7.
//              Hence, the sum becomes 2 + 3 + 5 + 7 = 17

// Input: arr = [4, 6, 8, 9, 10, 12, 14, 100, 120]
// Output: 0
// Explanation: There are no prime numbers in array 'arr'.
//              Hence, the sum is 0

public class Q1{

    static int sumOfPrimeNumbers(int[] arr){

        int sum = 0;

        outerloop:
        for(int index = 0; index < arr.length; index++){

            int num = arr[index];
            boolean isPrime = true;

            if(num == 1) continue;

            for(int i = 2; i*i <= num; i++){
                if( num % i == 0 ){
                    isPrime = false;
                    // break;
                    continue outerloop;
                }
            }

            if(isPrime)
                sum += num;
        }

        return sum;

    }

    public static void main(String[] args) {
        
        // int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // int[] arr = {2, 3, 5, 7, 11};
        int[] arr = {4, 6, 8, 9, 10, 12, 14, 100, 120};
        int sum = sumOfPrimeNumbers(arr);
        System.out.print(sum);

    }

}