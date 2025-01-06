import java.util.*;

public class MaxInRangeRecursive {

    // Recursive method to compute maximum up to index i
    private static void findMaxRecursively(int[] arr, int[] result, int i, int currentMax) {
        if (i == arr.length) {
            return; // Base case: stop recursion when index reaches the end of the array
        }

        // Update current maximum and store it in the result array
        currentMax = Math.max(currentMax, arr[i]);
        result[i] = currentMax;

        // Recursive call for the next index
        findMaxRecursively(arr, result, i + 1, currentMax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Array to store results
        int[] result = new int[n];

        // Start the recursion from index 0
        findMaxRecursively(arr, result, 0, Integer.MIN_VALUE);

        // Output the result array
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
            sc.close();     
        }
    }
}
