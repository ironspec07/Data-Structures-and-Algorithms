import java.util.Scanner;

public class Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            int oddCount = 0;
            int initialMax = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                if(a[i] % 2 == 1) {
                    oddCount++;
                }
                initialMax = Math.max(initialMax, a[i]);
            }
            
            // Case 1: No moves can be done because all towers are of the same parity.
            if (oddCount == 0 || oddCount == n) {
                System.out.println(initialMax);
                continue;
            }
            
            // Allowed moves exist because there is a mix of parity.
            long ans;
            if(oddCount == 1) {
                // We can concentrate everything into one tower.
                ans = sum;
            } else {
                // We have at least 2 odd towers.
                // In the final configuration, exactly oddCount towers must be odd.
                // We want one tower to be as high as possible.
                // Give 1 unit to each of the other (oddCount-1) towers.
                long candidate = sum - (oddCount - 1);
                // The target tower must be odd.
                if(candidate % 2 == 0) {
                    candidate--; // subtract one to make it odd
                }
                ans = candidate;
            }
            // The answer cannot be lower than the initial maximum.
            ans = Math.max(ans, initialMax);
            System.out.println(ans);
        }
        sc.close();
    }
}
