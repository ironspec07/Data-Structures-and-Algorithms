import java.util.*;

public class MEXTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        
        // To store the results for each test case
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            long n = scanner.nextLong(); // Number of rows
            long m = scanner.nextLong(); // Number of columns

            // Calculate the maximum sum of MEX across rows and columns
            long maxSum = Math.max(n, m)+1; // Larger of rows and columns determines the sum

            result.append(maxSum).append("\n");
        }

        // Output all results at once
        System.out.print(result);
        scanner.close();
    }
}