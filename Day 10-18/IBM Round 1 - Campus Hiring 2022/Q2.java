/*
Given the medals acquired by team india in olympics from year 1987 to 2022

Return an array with four values
1. Maximum medals won in a year.
2. Number of years with atleast one medal.
3. Number of years with no medal.
4. Sum of medals in last three years.
*/

/*
Input:
medals = [1, 32, 2, 31, 3, 30, 4, 29, 5, 28, 6, 27, 7, 26, 8, 25, 9, 24, 10, 23, 11, 22, 12, 21, 13, 20, 14, 19, 15, 18, 16, 17]

Output: 
Maximum medals won in a year: 32
Number of years with atleast one medal: 32
Number of years with no medal: 0
Sum of medals in last three years: 51

Explanation:
32 is the maximum value of the array 'medals'. Hence, maximum medals won is 32.
Since all the values are non-zero values, years with atleast one medals equals the size of the array which is 32 and
the years with no medals equals 0.
The last three medals count are 18, 16, 17. Hence 18 + 16 + 17 becomes 51.
*/

public class Q2 {
    
    private static int[] getOutputArray(int[] arr) {
        
        int results[] = new int[4];
        results[0] = Integer.MIN_VALUE;

        for(int index = 0; index < arr.length; index++){

            int medalsCount = arr[index];

            if(medalsCount == 0) results[2]++;
            
            if(index >= arr.length-3) results[3] += medalsCount;

            if(medalsCount > results[0]) results[0] = medalsCount;

        }

        results[1] = arr.length - results[2];

        return results;

    }

    public static void main(String[] args) {
        
        int[] medals = {1, 32, 2, 31, 3, 30, 4, 29, 5, 28, 6, 27, 7, 26, 8, 25, 9, 24, 10, 23, 11, 22, 12, 21, 13, 20, 14, 19, 15, 18, 16, 17};
        int[] outputArray = getOutputArray(medals);
        
        System.out.printf("Maximum medals won in a year: %d\n", outputArray[0]);
        System.out.printf("Number of years with atleast one medal: %d\n", outputArray[1]);
        System.out.printf("Number of years with no medal: %d\n", outputArray[2]);
        System.out.printf("Sum of medals in last three years: %d\n", outputArray[3]);

    }

}