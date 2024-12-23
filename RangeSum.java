import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            long L = scanner.nextLong();
            long R = scanner.nextLong();

            // Calculate the sum in range [L, R] using the formula
            long sum = sumUpTo(R) - sumUpTo(L - 1);
            System.out.println(sum);
        }

        scanner.close();
    }

    // Method to calculate the sum of first n natural numbers
    private static long sumUpTo(long n) {
        if (n <= 0) return 0;
        return n * (n + 1) / 2;
    }
}
