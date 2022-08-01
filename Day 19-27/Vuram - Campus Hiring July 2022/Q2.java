import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int index = 0; index < N; index++)
            arr[index] = sc.nextInt();

        printTriplets(arr);
    }

    private static void printTriplets(int[] arr) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int index = 0; index < arr.length; index++){

            int currentNum = arr[index];

            if((map.containsKey(currentNum - 3)) && (map.containsKey(currentNum - 6)))
                System.out.printf("%d %d %d\n", currentNum-6, currentNum-3, currentNum);

            map.put(currentNum, 1);

        }
    }

}
