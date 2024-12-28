import java.util.*;

public class StablePartition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the array
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Sort the array to make triangle inequality checks easier
            Arrays.sort(a);

            boolean found = false;

            // Check for any consecutive three elements that satisfy the triangle inequality
            for (int i = 0; i < n - 2; i++) {
                if (a[i] + a[i + 1] > a[i + 2]) {
                    found = true;
                    break;
                }
            }

            // Check if we can create at least two distinct partitions
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
