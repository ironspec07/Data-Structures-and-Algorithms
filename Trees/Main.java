import java.util.*;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalSum = 0;
        int totalArrays = 1 << N;  // 2^N

        for (int mask = 0; mask < totalArrays; mask++) {
            int[] t = new int[N + 1]; // 1-based indexing
            for (int i = 0; i < N; i++) {
                t[i + 1] = (mask >> i) & 1;
            }

            int specialValue = 0;

            for (int k = 2; k <= N; k++) {
                for (int h = k - 1; h >= 1; h--) {
                    if (t[h] != t[k]) {
                        specialValue = (specialValue + (k - h) * (k - h)) % MOD;
                        break;
                    }
                }
            }

            totalSum = (totalSum + specialValue) % MOD;
        }

        System.out.println(totalSum);
    }
}