import java.util.*;

public class MinimizeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] prefixMin = new int[n];
            prefixMin[0] = a[0];
            for (int i = 1; i < n; i++) {
                prefixMin[i] = Math.min(prefixMin[i - 1], a[i]);
            }
            long initialSum = 0;
            for (int min : prefixMin) {
                initialSum += min;
            }

            long minSum = initialSum;
            int[] minFromLeft = new int[n];
            minFromLeft[0] = a[0];
            for (int i = 1; i < n; i++) {
                minFromLeft[i] = Math.min(minFromLeft[i - 1], a[i]);
            }

            int[] minFromRight = new int[n];
            minFromRight[n - 1] = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                minFromRight[i] = Math.min(minFromRight[i + 1], a[i]);
            }

            for (int j = 1; j < n; j++) {
                // Try to zero a[j] and add its value to some a[i] (i < j)
                // The best i is the first occurrence where a[i] is not the min up to i
                int bestTransfer = 0;
                for (int i = 0; i < j; i++) {
                    if (a[i] != minFromLeft[i]) {
                        bestTransfer = i;
                        break;
                    }
                }

                int[] modifiedA = a.clone();
                modifiedA[bestTransfer] += modifiedA[j];
                modifiedA[j] = 0;

                int[] modifiedPrefixMin = new int[n];
                modifiedPrefixMin[0] = modifiedA[0];
                long modifiedSum = modifiedPrefixMin[0];
                for (int k = 1; k < n; k++) {
                    modifiedPrefixMin[k] = Math.min(modifiedPrefixMin[k - 1], modifiedA[k]);
                    modifiedSum += modifiedPrefixMin[k];
                }

                if (modifiedSum < minSum) {
                    minSum = modifiedSum;
                }
            }

            System.out.println(minSum);
        }
        sc.close();
    }
}