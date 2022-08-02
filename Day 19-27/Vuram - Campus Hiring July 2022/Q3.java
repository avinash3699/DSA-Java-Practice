// Given two arrays 'arr1' and 'arr2'. Print the elements that are not common between the two arrays.

// Input:
// arr1 = [1, 2, 3, 4]
// arr2 = [2, 4, 6, 8]

// Output:
// 1 3 6 8

// Explanation:
// The elements 1 and 3 are present in arr1 but not in arr2. Likewise, the elements 6 and 8 are present in arr2 but not in arr1

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N], arr2 = new int[N];

        for(int index = 0; index < N; index++)
            arr1[index] = sc.nextInt();

        for(int index = 0; index < N; index++)
            arr2[index] = sc.nextInt();

        printUncommonElements(arr1, arr2);
        
    }

    // Using HashMap
    private static void printUncommonElements(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int index = 0; index < arr1.length; index++){
            map.put(arr1[index], map.getOrDefault(arr1[index], 0) + 1);
            map.put(arr2[index], map.getOrDefault(arr2[index], 0) + 1);
        }

        for(int key: map.keySet()){
            if(map.get(key) == 1)
                System.out.print(key + " ");
        }

    }
    
}